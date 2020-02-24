package ReduceJoin_1_7;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;

import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;

public class TableDriver {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        args = new String[]{"E:\\WorkPlace\\joindata", "E:\\WorkPlace\\joindata\\joinOutput"};

        //获取配置文件
        Configuration conf = new Configuration();
        //创建job任务
        Job job = Job.getInstance(conf);
        job.setJarByClass(TableDriver.class);

        //指定Map类和map的输出类型 Text, IntWritable
        job.setMapperClass(TableMapper.class);
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(TableBean.class);


        //指定Reducer类和reduce的输出数据类型 Text,IntWritable
        job.setReducerClass(TableReducer.class);
        job.setOutputKeyClass(TableBean.class);
        job.setOutputValueClass(NullWritable.class);

        //指定数据输入的路径和输出的路径
        FileInputFormat.setInputPaths(job, new Path(args[0]));
        FileOutputFormat.setOutputPath(job, new Path(args[1]));

        //提交任务
        boolean res = job.waitForCompletion(true);
        System.exit(res ? 0 : 1);
    }
}