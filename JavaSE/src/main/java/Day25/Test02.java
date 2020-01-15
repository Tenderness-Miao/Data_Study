package Day25;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        // 加载类并获取String类的类对象
        Class s = Class.forName("java.lang.String");

        // 获取父类的类对象
        Class superS = s.getSuperclass();
        System.out.println(superS);

        // 通过类对象获取类名
        System.out.println(s.getName());
        System.out.println("---------------");

        // 获取该类实现的所有接口
        Class[] interfaces = s.getInterfaces();
        for (Class infa : interfaces) {
            System.out.println(infa);
        }
        System.out.println("----------------");

        Class stu = Student.class;
        Field[] fields = stu.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        Field name = stu.getDeclaredField("name");
        System.out.println(name);
        System.out.println("----------------");

        // 获取声明的构造器
        // 无参构造器
        Constructor constructor1 = stu.getDeclaredConstructor();
        System.out.println(constructor1);

        // 有参构造器
        Constructor constructor2 = stu.getDeclaredConstructor(String.class, int.class);
        System.out.println(constructor2);

        Constructor[] constructors = stu.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("----------------");

        // 获取所有声明的方法
        Method[] methods = stu.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("----------------");

        // 获取setAge方法，参数列表：int
        Method setAge = stu.getDeclaredMethod("setAge", int.class);
        System.out.println(setAge);
    }
}
