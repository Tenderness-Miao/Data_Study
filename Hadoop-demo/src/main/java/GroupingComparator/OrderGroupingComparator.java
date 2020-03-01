package GroupingComparator;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class OrderGroupingComparator extends WritableComparator {
    public OrderGroupingComparator() {
        super(OrderBean.class, true);
    }

    @Override
    public int compare(WritableComparable a, WritableComparable b) {
        OrderBean aBean = (OrderBean) a;
        OrderBean bBean = (OrderBean) b;
        int res;
        if (aBean.getOrder_id() > bBean.getOrder_id()) {
            res = 1;
        } else if (aBean.getOrder_id() < bBean.getOrder_id()) {
            res = -1;
        } else {
            res = 0;
        }
        return res;
    }
}
