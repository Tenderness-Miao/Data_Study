package PhoneLog.ComparablePhoneLog;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class PhoneReducer extends Reducer<PhoneBean, Text, Text, PhoneBean> {
    @Override
    protected void reduce(PhoneBean key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
        for (Text text : values) {
            context.write(text, key);
        }
    }
}
