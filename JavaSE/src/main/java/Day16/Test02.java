package Day16;

import java.util.HashSet;
import java.util.Set;

public class Test02 {
    public static void main(String[] args) {
        /**
         * HashSet 实现了Set接口 不允许存储重复元素 依赖于equals方法
         * set是无序的集合，不保存元素添加的顺序
         * 但是对Set集合迭代遍历，每次输出顺序都一样
         */
        Set<String> set = new HashSet<>();
        set.add("张三");
        set.add("李四");
        set.add("王五");
        // 不添加重复元素 String类重写了equals方法
        boolean flag = set.add("张三");
        System.out.println(flag);
        for (String str : set) {
            System.out.println(str);
        }
    }
}
