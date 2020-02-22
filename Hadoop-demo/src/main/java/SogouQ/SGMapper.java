package SogouQ;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class SGMapper extends
        Mapper<LongWritable, Text, LongWritable, Text> {
        LogParser logParser = new LogParser();
        Text outputValue = new Text();

        protected void map(
                LongWritable key,
                Text value,
               Context context) throws IOException, InterruptedException {
            final String[] parsed = logParser.parse(value.toString());

            // 写入前字段记录类型项
            outputValue.set(parsed[0] + "\t" + parsed[1] + "\t" + parsed[2]+"\t"+parsed[3]+"\t"+parsed[4]+"\t"+parsed[5]);
            context.write(key, outputValue);
        }

}
