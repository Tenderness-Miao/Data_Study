package Day17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test02 {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>();
        // put方法将键值对加入到映射表中
        map.put("10001", new Student(1, "zhangsan", 24));
        map.put("10002", new Student(2, "lisi", 21));
        map.put("10003", new Student(3, "wangwu", 28));

        Set<String> keys = map.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + ":" + map.get(key));
        }

        /**
         * HashMap：数组 + 链表（红黑树）
         * 初始容量：
         * 填装因子：填入表中的元素/容量
         */

        HashMap<String ,Student> map1=new HashMap<>(64,0.75f);
    }
}
