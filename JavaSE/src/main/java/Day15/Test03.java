package Day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 集合是重量级的，数组是轻量级
 * 集合是动态的，数组是长度固定的
 * 集合和数组都可以存放引用数据类型
 */
public class Test03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");

        // iterator()方法将返回集合的迭代器
        // 迭代器用来遍历集合
        Iterator<String> iterator = list.iterator();

        // hasNext()判断集合是否有下一个元素，返回Boolean值，有就返回true
        while (iterator.hasNext()) {
            // next()获取集合下一个元素值
            String str = iterator.next();
            System.out.println(str);
        }

        // foreach内部就是迭代器实现的
        for (String s : list) {
            System.out.println(s);
        }
//        ArrayList<List<String>> lists = new ArrayList<>();
//        lists.add(new ArrayList<String>());
        ArrayList<Object> list2 = new ArrayList<>();
        list2.add(new Integer("1"));
        list2.add("2");
        list2.add(new Long(3));

        Object o1 = list2.get(1);
        System.out.println(o1);

        // 集合中加入不同类型的元素，普通for循环不能遍历，无法统一识别
        for (Object o : list2) {
            System.out.println(o);
        }
    }
}
