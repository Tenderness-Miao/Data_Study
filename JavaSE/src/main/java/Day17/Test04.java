package Day17;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test04 {
    public static void main(String[] args) {
        /**
         * TreeMap实现了Map接口和SortedMap接口
         * 操作和HashMap相同，但TreeMap有序
         * TreeMap内部按照元素字典顺序排序
         * TreeMap和TreeSet一样，要求实现Comparable接口，或者在构造时提供一个Comparable的实例
         */
        TreeMap<Integer, Student> map = new TreeMap<>();
        map.put(3, new Student(100, "张三", 24));
        map.put(2, new Student(101, "李四", 21));
        map.put(1, new Student(102, "王五", 28));
        Set<Map.Entry<Integer, Student>> set = map.entrySet();
        for (Map.Entry<Integer, Student> entry : set) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
