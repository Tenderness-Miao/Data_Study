package GroupingComparator;

import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.Partitioner;

public class OrderPartition extends Partitioner<OrderBean, NullWritable> {
    @Override
    public int getPartition(OrderBean key, NullWritable value, int NumReduceTask) {
        return (key.getOrder_id() & Integer.MAX_VALUE) % NumReduceTask;
    }
}
