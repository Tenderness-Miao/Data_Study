package SogouQ;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class SGReducer extends Reducer<LongWritable, Text, Text, NullWritable> {
protected void reduce(
        LongWritable k2,
        Iterable<Text> v2s,
        Context context)
        throws java.io.IOException, InterruptedException {
        for (Text v2 : v2s) {
        context.write(v2, NullWritable.get());
        }
    };
}
