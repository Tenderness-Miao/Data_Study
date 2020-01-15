package Day17;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test05 {
    public static void main(String[] args) {
        TreeMap<KeyNum, String> map = new TreeMap<>(new Comparator<KeyNum>() {
            @Override
            public int compare(KeyNum o1, KeyNum o2) {
                return o1.getKey() - o2.getKey();
            }
        });
        map.put(new KeyNum(100), "张三");
        map.put(new KeyNum(101), "李四");
        map.put(new KeyNum(99), "王五");
        Set<Map.Entry<KeyNum, String>> set = map.entrySet();
        for (Map.Entry<KeyNum, String> entry : set) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
