package MapJoin_1_7;

import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class DCMapper extends Mapper<LongWritable, Text, Text, NullWritable> {
    Map<String, String> pdMap = new HashMap<String, String>();

    @Override
    protected void setup(Context context) throws IOException, InterruptedException {
        //获取缓存文件路径
        URI[] cacheFiles = context.getCacheFiles();
        String path = cacheFiles[0].getPath().toString();
        // 获取缓存文件
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
        String line;
        while (!StringUtils.isEmpty(line = reader.readLine())) {
            //处理数据
            String[] fields = line.split("\t");

            //缓存数据到集合
            pdMap.put(fields[0], fields[1]);
        }

    }

    Text k = new Text();

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        //1 获取第一行数据
        String line = value.toString();
        //截取
        String[] fields = line.split("\t");
        //获取产品id
        String p_id = fields[1];
        //获取商品名称
        String pdName = pdMap.get(p_id);
        // 拼接
        k.set(line + "\t" + pdName);
        //写出
        context.write(k, NullWritable.get());
    }
}