package Day16;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test07 {
    public static void main(String[] args) {
        Student s1 = new Student(100, "Jack", 20);
        Student s2 = new Student(101, "Rose", 19);
        Student s3 = new Student(102, "John", 22);
        Student s4 = new Student(100, "Jack", 20);
        Set<Student> set = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

        for (Student stu : set) {
            System.out.println(stu);
        }
    }
}
