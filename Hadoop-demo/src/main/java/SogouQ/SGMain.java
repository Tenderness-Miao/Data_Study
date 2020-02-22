package SogouQ;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
public class SGMain {
    public static void main(String[] args) throws Exception {
        args=new String[]{
                "hdfs://node01:8020/data/flume/Events/19-09-30/*",
                "hdfs://node01:8020/data/flume/output2"
        };
        Configuration conf = new Configuration();
        //conf.set("fs.defaultFS","hdfs://node01:8020");

        Job job = Job.getInstance(conf);
        job.setJarByClass(SGMain.class);

        FileInputFormat.setInputPaths(job,new Path(args[0]));
        FileOutputFormat.setOutputPath(job,new Path(args[1]));

        job.setMapperClass(SGMapper.class);
        job.setReducerClass(SGReducer.class);
        job.setMapOutputKeyClass(LongWritable.class);
        job.setMapOutputValueClass(Text.class);

        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(NullWritable.class);
        job.waitForCompletion(true);

    }
}
