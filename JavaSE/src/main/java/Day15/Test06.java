package Day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test06 {
    // 通过实现compareable接口中的compare方法完成排序
    public static void main(String[] args) {
        List<Student> sList = new ArrayList<>();
        Student s1 = new Student(0001, "王帅", 18);
        Student s2 = new Student(0002, "李美", 18);
        Student s3 = new Student(0003, "赵高", 20);
        Student s4 = new Student(0004, "钱多", 17);
        sList.add(s1);
        sList.add(s2);
        sList.add(s3);
        sList.add(s4);
        System.out.println(sList);
        //依赖于元素实现Comparable接口中的compareTo()方法
//        Collections.sort(sList);
        System.out.println(sList);
    }
}
