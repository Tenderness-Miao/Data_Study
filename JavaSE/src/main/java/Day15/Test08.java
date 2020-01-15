package Day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test08 {
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
        //集合转为数组
        Object[] arr = sList.toArray();
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            Student s = (Student) arr[i];
            System.out.println(s);
        }

        Student[] strArr = new Student[sList.size()];
        Student[] strArr1 = sList.toArray(strArr);
        for (int i = 0; i < strArr1.length; i++) {
            System.out.println(strArr1[i]);
        }

        System.out.println("---------------------");
        // 将数组转换为集合 asList方法转换为集合
        List<Object> list = Arrays.asList(arr);
        for (Object s : list) {
            System.out.println(s);
        }
    }
}
