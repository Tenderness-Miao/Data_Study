package Day16;

import java.util.Set;
import java.util.TreeSet;

public class Test06 {
    //实现Comparable接口
    public static void main(String[] args) {
        Student s1 = new Student(100, "Jack", 20);
        Student s2 = new Student(101, "Rose", 19);
        Student s3 = new Student(102, "John", 22);
        Student s4 = new Student(100, "Jack", 20);

        Set<Student> set = new TreeSet<>();
        set.add(s1);//Student没有实现comparable接口,运行时报错
        set.add(s2);
        set.add(s3);
        set.add(s4);

        for (Student stu : set) {
            System.out.println(stu);
        }
    }
}
