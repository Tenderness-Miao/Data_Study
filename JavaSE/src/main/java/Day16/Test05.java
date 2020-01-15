package Day16;

import java.util.Set;
import java.util.TreeSet;

public class Test05 {
    public static void main(String[] args) {
        /**
         * Treeset实现了Set接口和SortedSort接口
         * 操作和HashSet一样，TreeSet不允许出现重复元素
         * 他讲元素安照一定顺序来存储（不是插入元素的顺序）
         * 而是字典顺序
         * 对TreeSet进行迭代，按照字典顺序返回
         * TreeSet要求元素实现Comparable接口,因此TreeSet会对字符串按照字典顺序来排序.
         */
        Set<String> set = new TreeSet<>();
        set.add("Jack");
        set.add("Rose");
        set.add("John");
        for (String str : set) {
            System.out.println(str);
        }
    }
}
