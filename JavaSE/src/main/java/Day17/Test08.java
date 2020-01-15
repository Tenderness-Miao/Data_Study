package Day17;

import java.util.Hashtable;
import java.util.Map;

public class Test08 {
    public static void main(String[] args) {
        /**
         * HashTable实现了Map接口，操作和HashMap一样，线程安全，效率不如HashMap
         */
        Map<Integer, String> map = new Hashtable<>();
        map.put(1, "a");
        map.put(2, "a");
        map.put(3, "c");
        System.out.println(map);
    }
}
