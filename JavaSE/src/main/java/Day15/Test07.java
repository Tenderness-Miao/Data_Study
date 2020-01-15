package Day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test07 {
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
        Collections.sort(sList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println(sList);
    }
}
