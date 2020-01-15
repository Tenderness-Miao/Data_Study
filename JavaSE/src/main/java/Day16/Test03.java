package Day16;

import java.util.HashSet;
import java.util.Set;

public class Test03 {
    public static void main(String[] args) {
        Student s1 = new Student(100, "张三", 20);
        Student s2 = new Student(101, "李四", 19);
        Student s3 = new Student(102, "王五", 22);
        Student s4 = new Student(100, "张三", 20);
        Set<Student> set = new HashSet<>();
        System.out.println(set.add(s1));
        System.out.println(set.add(s2));
        System.out.println(set.add(s3));
        System.out.println(set.add(s4));

        for (Student s :set) {
            System.out.println(s);
        }
    }
}
