package PhoneLog.ComparablePhoneLog;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class PhonePartition extends Partitioner<PhoneBean, Text> {
    @Override
    public int getPartition(PhoneBean key, Text value, int i) {
        // 获取手机号前三位
        String perNum = value.toString().substring(0, 3);
        int partition = 4;
        if ("136".equals(perNum)) {
            partition = 0;
        } else if ("137".equals(perNum)) {
            partition = 1;
        } else if ("138".equals(perNum)) {
            partition = 2;

        } else if ("139".equals(perNum)) {
            partition = 4;
        }
        return partition;
    }
}
