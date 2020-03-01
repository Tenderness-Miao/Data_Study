package HomeWork.MapJoin;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class JoinReducer extends Reducer<Text, JoinBean, JoinBean, NullWritable> {
    @Override
    protected void reduce(Text key, Iterable<JoinBean> values, Context context) throws IOException, InterruptedException {
        List<JoinBean> orderBeans = new ArrayList<>();
        JoinBean pdBean = new JoinBean();
        for (JoinBean bean : values) {
            // 拷贝传递过来的数据到集合中
            if ("1".equals(bean.getFlag())) {
                try {
                    BeanUtils.copyProperties(pdBean, bean);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            } else {JoinBean orderBean = new JoinBean();
                try {
                    BeanUtils.copyProperties(orderBean, bean);
                    orderBeans.add(orderBean);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }

        for (JoinBean bean : orderBeans) {
            bean.setP_name(pdBean.getP_name());
            bean.setCategory_id(pdBean.getCategory_id());
            bean.setPrice(pdBean.getPrice());
            // 写出
            context.write(bean, NullWritable.get());
        }

    }
}
