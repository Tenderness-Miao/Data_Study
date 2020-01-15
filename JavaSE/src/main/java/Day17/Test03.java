package Day17;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Test03 {
    /**
     * LinkedHashMap是HashMap的子类，操作和HashMap一样
     * LinkedHashMap不允许出现重复的元素，保留插入元素的顺序
     * 遍历是返回元素添加顺序
     */
    public static void main(String[] args) {
        LinkedHashMap<String, Student> map = new LinkedHashMap<>(64, 0.75f);
        map.put("10001", new Student(1, "张三", 24));
        map.put("10002", new Student(2, "李四", 21));
        map.put("10003", new Student(3, "王五", 28));

        // keySet()
        Set<Map.Entry<String, Student>> set = map.entrySet();
        for (Map.Entry<String, Student> entry : set) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
