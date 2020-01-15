package PhoneLog;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class FlowCountReducer extends Reducer<Text, FlowBean, Text, FlowBean> {
    @Override
    protected void reduce(Text key, Iterable<FlowBean> values, Context context) throws IOException, InterruptedException {
        long sum_UpFlow = 0;
        long sum_DownFlow = 0;
        // 遍历bean，将其中的上下行流量数据获取累加
        for (FlowBean flowBean : values) {
            sum_DownFlow += flowBean.getDownFlow();
            sum_UpFlow += flowBean.getUpFlow();
        }
        // 封装数据
        FlowBean resultBean = new FlowBean(sum_UpFlow, sum_DownFlow);
        // 写出
        context.write(key, resultBean);
    }
}
