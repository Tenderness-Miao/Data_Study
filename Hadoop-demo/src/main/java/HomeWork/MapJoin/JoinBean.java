package HomeWork.MapJoin;

import org.apache.hadoop.io.Writable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class JoinBean implements Writable {
    private String order_id;
    private String date;
    private String p_id;
    private int amount;

    private String p_name;
    private String category_id;
    private int price;
    private String flag;

    public JoinBean() {
    }

    public JoinBean(String order_id, String date, String p_id, int amount, String p_name, String category_id, int price, String flag) {
        this.order_id = order_id;
        this.date = date;
        this.p_id = p_id;
        this.amount = amount;
        this.p_name = p_name;
        this.category_id = category_id;
        this.price = price;
        this.flag = flag;
    }


    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getP_id() {
        return p_id;
    }

    public void setP_id(String p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return order_id + "\t" + date + "\t" + p_name + "\t" + category_id + "\t" + price;
    }

    @Override
    public void write(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(order_id);
        dataOutput.writeUTF(date);
        dataOutput.writeUTF(p_id);
        dataOutput.writeInt(amount);
        dataOutput.writeUTF(p_name);
        dataOutput.writeUTF(category_id);
        dataOutput.writeInt(price);
        dataOutput.writeUTF(flag);
    }

    @Override
    public void readFields(DataInput dataInput) throws IOException {
        this.order_id = dataInput.readUTF();
        this.date = dataInput.readUTF();
        this.p_id = dataInput.readUTF();
        this.amount = dataInput.readInt();
        this.p_name = dataInput.readUTF();
        this.category_id = dataInput.readUTF();
        this.price = dataInput.readInt();
        this.flag = dataInput.readUTF();
    }
}
