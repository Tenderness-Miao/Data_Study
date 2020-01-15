package Day15;

import java.util.ArrayList;
import java.util.List;

public class Test04 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("李四");
        list.add("王五");

        /**
         * indexOf()方法返回元素第一次出现的索引的位置
         * 如果没有返回 -1
         * 这个方法是equals方法的实现
         */
        System.out.println(list.indexOf("李四"));

        /**
         * lastIndexOf()方法返回元素最后一次出现的索引位置
         * 如果没找到返回-1
         */
        System.out.println(list.lastIndexOf("王五"));

        /**
         * set()方法用于替换指定索引位置的元素，返回旧元素
         */
        System.out.println(list.set(1, "赵六"));
        System.out.println(list);
        System.out.println("-------------------");

        /**
         * remove()方法可以删除指定元素，有俩个重载
         */
        String str = list.remove(1);
        System.out.println(list);
        System.out.println(str);
        System.out.println("--------------------");

        boolean flag = list.remove("王五");
        System.out.println(list.remove("赵六"));
        System.out.println(list);
        System.out.println(flag);
        System.out.println("-------------------");

        /**
         * removeAll()方法删除该集合中包含的给定集合的所有元素
         * 去除俩个集合交集（俩个集合共有的元素）
         */
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("张三");
        list2.add("李四");
        list2.removeAll(list2);
        System.out.println(list2);
    }
}
