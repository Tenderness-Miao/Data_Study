package Day17;


import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Test01 {
    public static void main(String[] args) {
        /**
         * HashMap实现了Map接口，HashMap是无序的
         * 不保存元素的插入顺序，在内部也不保证按照元素的大小顺序排列
         */
        HashMap<String, Student> map = new HashMap<>();
        // put方法将键值对加入到映射表中
        map.put("10001", new Student(1, "张三", 24));
        map.put("10002", new Student(2, "李四", 21));
        map.put("10003", new Student(3, "王五", 28));
        // value允许重复
        map.put("10004", new Student(3, "王五", 28));
        // key不允许重复
        Student stu = map.put("10003", new Student(3, "王五", 28));
        // 重复的key，新的value值会覆盖旧的值，然后返回旧的value值
        System.out.println(stu);
        System.out.println(map);

        System.out.println("-------------------------");
        HashMap<KeyNum, Object> map2 = new HashMap<>();
        map2.put(new KeyNum(1), "0001");
        map2.put(new KeyNum(2), "0002");
        map2.put(new KeyNum(1), "0003");
        System.out.println(map2);
        System.out.println("--------------------------");

        Student stu2 = map.get("10003");
        System.out.println(stu2);
        String str = (String) map2.get(new KeyNum(2));
        System.out.println(str);

        // size()
        int size = map.size();
        System.out.println(size);

        // isEmpty()
        boolean empty = map.isEmpty();
        System.out.println(empty);

        // containsKey()
        boolean b = map.containsKey("10005");
        System.out.println(b);

        // remove()
        Student stu3 = map.remove("10004");
        System.out.println(stu3);

        // clear()
//        map.clear();
//        System.out.println(map);

        // keySet()
        Set<String> keys = map.keySet();
        System.out.println(keys);

        // values()
        Collection<Student> values = map.values();
        System.out.println(values);
    }
}
