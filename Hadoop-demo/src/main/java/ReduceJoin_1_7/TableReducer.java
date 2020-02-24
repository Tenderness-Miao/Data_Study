package ReduceJoin_1_7;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class TableReducer extends Reducer<Text, TableBean, TableBean, NullWritable> {
    @Override
    protected void reduce(Text key, Iterable<TableBean> values, Context context) throws IOException, InterruptedException {
        ArrayList<TableBean> orderBeans = new ArrayList<TableBean>();
        TableBean pdBean = new TableBean();
        for (TableBean bean : values) {
            TableBean orderBean = new TableBean();
            //拷贝传递过来的每条订单数据到集合中
            if ("0".equals(bean.getFlag())) {
                try {
                    BeanUtils.copyProperties(orderBean, bean);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
                orderBeans.add(orderBean);
            } else {
                //拷贝传过来的产品表到内存中
                try {
                    BeanUtils.copyProperties(pdBean, bean);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        //表的拼接
        for (TableBean bean : orderBeans) {
            bean.setP_name(pdBean.getP_name());
            //写入
            context.write(bean, NullWritable.get());
        }
    }
}