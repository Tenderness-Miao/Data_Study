package Day25;

public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class stringClass = String.class;
        System.out.println(stringClass);

        // 1.获取Student类对象
        Class stuClass1 = Student.class;
        System.out.println(stuClass1);

        // 2.使用继承自Object类的实例化方法getClass
        Student stu1 = new Student("净空", 18);
        Class stuClass2 = stu1.getClass();
        System.out.println(stuClass2);

        // 3.使用Class里面的静态方法forName
        Class stuClass3 = Class.forName("Day25.Student");
        System.out.println(stuClass3);

        System.out.println(stuClass1 == stuClass2);
        System.out.println(stuClass1 == stuClass3);

        // 接口也可以反射
        Class c1 = Comparable.class;
        System.out.println(c1);

        // 包装类也可以反射
        Class c2 = Integer.class;
        System.out.println(c2);

        // 基本类型也有类对象
        Class c3 = int.class;
        System.out.println(c3);
        System.out.println(c2 == c3);
    }
}
