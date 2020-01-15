package homework;

/**
 * @program: Data_Study
 * @description: day01 作业
 * @author: HaoMiao
 * @create: 2019-10-19 12:46
 **/
public class Day01 {
    public static void main(String[] args) {
        homeWork1();
        homeWork2();
    }

    private static void homeWork1() {
        // 方式1：声明并赋值
        int i = 1;

        // 方式2：先声明后赋值
        double d;
        d = 3.14;

        // 方式3：多变量声明赋值
        long l1, l2 = 1000L;
        l1 = 102L;

        /**
         * 常量：
         * 声明规则：声明赋值同时进行
         * 命名规则：常量一般使用大写，与变量进行区分
         */
        final String PI = "3.14159";
        System.out.println(i);
        System.out.println(d);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(PI);
    }

    private static void homeWork2() {

        // 隐式转换
        // int转long
        // int转double
        int i = 12;
        long l = i;
        System.out.println("l = " + l);
        double d = i;
        System.out.println("d = " + d);

        // 强制转换
        // long转byte
        // int转long
        // int转byte

        long l1 = 123234L;
        System.out.println("l1 = " + (byte) l1);
        int i1 = 123;
        System.out.println("i1 = " + (long) i1);
        int i2 = 1234;
        System.out.println("i2 = " + (byte) i2);

    }
}
