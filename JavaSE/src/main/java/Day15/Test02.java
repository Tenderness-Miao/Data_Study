package Day15;

import java.util.ArrayList;

/**
 * List接口继承自Collection接口，拥有该接口中的所有方法
 * List：有序的列表，保留了元素的添加顺序，允许将元素添加到指定位置
 */
public class Test02 {
    public static void main(String[] args) {
        // 创建一个ArrayList集合
        // <>是泛型 指示集合中只能保存对应的引用类型数据
        ArrayList<String> list = new ArrayList<>();
        list.add("String");
        list.add("Integer");
        list.add("Double");
        // List集合里可以添加重复元素
        list.add("String");
        // 将指定元素放置指定位置
        list.add(0, "Float");

        // 遍历集合 普通for
        for (int i = 0; i < list.size(); i++) {
            // get()方法返回指定索引处的元素
            String s = list.get(i);
            System.out.println(s);
        }

        // ArrayList重写了toString方法
        System.out.println(list.toString());

        // 判断集合是否为空 返回Boolean值
        System.out.println(list.isEmpty());

        // contains()方法用于判断List集合中是否包含指定元素
        System.out.println(list.contains("String"));
    }

}
