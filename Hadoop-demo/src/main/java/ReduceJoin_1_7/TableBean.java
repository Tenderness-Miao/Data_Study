package ReduceJoin_1_7;

import org.apache.hadoop.io.Writable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class TableBean implements Writable {
    private String order_id;
    private String p_id;
    private int amount;

    private String p_name;
    private String flag;

    public TableBean() {
    }

    public TableBean(String order_id, String p_id, int amount, String p_name, String flag) {
        this.order_id = order_id;
        this.p_id = p_id;
        this.amount = amount;
        this.p_name = p_name;
        this.flag = flag;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getP_id() {
        return p_id;
    }

    public void setP_id(String p_id) {
        this.p_id = p_id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public void write(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(order_id);
        dataOutput.writeUTF(p_id);
        dataOutput.writeInt(amount);
        dataOutput.writeUTF(p_name);
        dataOutput.writeUTF(flag);
    }

    @Override
    public void readFields(DataInput dataInput) throws IOException {
        this.order_id = dataInput.readUTF();
        this.p_id = dataInput.readUTF();
        this.amount = dataInput.readInt();
        this.p_name = dataInput.readUTF();
        this.flag = dataInput.readUTF();

    }

    @Override
    public String toString() {
        return order_id + '\t' + p_name + '\t' + amount;
    }
}