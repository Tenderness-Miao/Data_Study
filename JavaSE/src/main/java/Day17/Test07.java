package Day17;

import java.util.List;
import java.util.Vector;

public class Test07 {
    public static void main(String[] args) {
        /**
         * Vector实现了List接口，多线程下使用（线程安全）
         * 效率低于ArrayList
         */
        List<String> vector = new Vector<>();
        vector.add("a");
        vector.add("b");
        vector.add("c");
        System.out.println(vector);
    }
}
