package ReduceJoin_1_7;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.lib.input.FileSplit;

import java.io.IOException;

public class TableMapper extends Mapper<LongWritable, Text, Text, TableBean> {
    Text k = new Text();
    TableBean bean = new TableBean();

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        //1.获取输入文件名
        FileSplit split = (FileSplit) context.getInputSplit();
        String name = split.getPath().getName();

        //获取输入文件数据
        String line = value.toString();

        //根据不同文件去处理
        if (name.startsWith("order")) {
            //分割字段
            String[] fields = line.split("\t");
            //封装bean对象
            bean.setOrder_id(fields[0]);
            bean.setP_id(fields[1]);
            bean.setAmount(Integer.parseInt(fields[2]));
            bean.setP_name("");
            bean.setFlag("0");
            k.set(fields[1]);
        } else {
            //产品表切割
            String[] fields = line.split("\t");
            //封装bean对象
            bean.setOrder_id("");
            bean.setP_id(fields[0]);
            bean.setAmount(0);
            bean.setP_name(fields[1]);
            bean.setFlag("1");

            k.set(fields[0]);

        }

        context.write(k, bean);
    }
}