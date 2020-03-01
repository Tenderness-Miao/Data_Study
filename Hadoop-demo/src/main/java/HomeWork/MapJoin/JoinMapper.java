package HomeWork.MapJoin;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.lib.input.FileSplit;

import java.io.IOException;

public class JoinMapper extends Mapper<LongWritable, Text, Text, JoinBean> {
    Text k = new Text();
    JoinBean bean = null;

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        // 获取文件名
        FileSplit split = (FileSplit) context.getInputSplit();
        String name = split.getPath().getName();

        // 获取文本输入
        String line = value.toString();
        String[] fields = line.split("\t");
        String pid = "";
        // 根据不同文件处理
        if (name.startsWith("order")) {
            pid = fields[2];
            bean = new JoinBean(fields[0],fields[1],pid,Integer.parseInt(fields[3]),"","",-1,"0");
        } else {
            pid = fields[0];
            bean = new JoinBean("","",pid,-1,fields[1],fields[2],Integer.parseInt(fields[3]),"1");
        }
        k.set(pid);
        // 写出
        context.write(k, bean);
    }
}
