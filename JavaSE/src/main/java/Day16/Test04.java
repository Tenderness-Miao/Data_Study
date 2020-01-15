package Day16;

import java.util.LinkedHashSet;

public class Test04 {
    public static void main(String[] args) {
        /**
         * LinkedHashSet是HashSet的一个子类，并且和HashSet一样
         * 1.不允许重复元素
         * 2.保留元素插入的顺序
         * 进行LinkedHashSet迭代时，会安照元素添加的顺序来返回
         */
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("张三");
        set.add("李四");
        set.add("王五");
        for (String str : set) {
            System.out.println(str);
        }
    }
}
