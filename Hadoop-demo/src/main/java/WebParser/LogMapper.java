package WebParser;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.util.Arrays;

public class LogMapper extends Mapper<LongWritable, Text, LongWritable, Text> {
    LogParser logParser = new LogParser();
    Text outputValue = new Text();

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String[] parsed = logParser.parse(value.toString());
        StringBuilder log = new StringBuilder();
        for (String s : parsed) {
            if (s != null) {
                log.append(s).append("\t");
            }
        }
        if (!(log.toString()).isEmpty()) {
            outputValue.set(log.toString().trim());
            context.write(key, outputValue);
        }
    }
}
