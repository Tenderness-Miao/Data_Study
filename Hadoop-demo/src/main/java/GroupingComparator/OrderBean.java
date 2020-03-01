package GroupingComparator;

import org.apache.hadoop.io.WritableComparable;
import org.jetbrains.annotations.NotNull;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class OrderBean implements WritableComparable<OrderBean> {
    private int Order_id;
    private double price;

    public OrderBean() {
    }

    public OrderBean(int order_id, double price) {
        Order_id = order_id;
        this.price = price;
    }

    @Override
    public String toString() {
        return Order_id + "\t" + price;
    }

    public int getOrder_id() {
        return Order_id;
    }

    public void setOrder_id(int order_id) {
        Order_id = order_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(OrderBean o) {
        int result;
        if (this.Order_id > o.getOrder_id()) {
            return 1;
        } else if (this.Order_id < o.getPrice()) {
            return -1;
        } else {
            result = this.price > o.getPrice() ? -1 : 1;
        }
        return result;
    }

    @Override
    public void write(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(Order_id);
        dataOutput.writeDouble(price);
    }

    @Override
    public void readFields(DataInput dataInput) throws IOException {
        this.Order_id = dataInput.readInt();
        this.price = dataInput.readDouble();
    }
}
