package Day05;

/**
 * @program: Data_Study
 * @description: 变量作用域，类常量和类方法
 * @author: HaoMiao
 * @create: 2019-10-26 23:16
 **/
public class StaticTest {
    /**
     * 在类中使用static声明的变量叫做类变量，使用static声明的方法叫做类方法
     * 在类中使用static final 声明的常量叫类常量
     */

    static final double PI = 3.14;
    final int T = 10;
    // int c = T;

    public static void main(String[] args) {
        System.out.println(StaticTest.PI);
        System.out.println(Math.PI);
        double b = PI;
        // int c = T; 不能使用
    }

    /**
     * 变量的作用范围（在哪里可以执行，在哪里不能执行）就叫作用域
     * <p>
     * 局部变量：
     * 在快中声明的变量，就叫（块变量）只能在当前块中使用
     * 在方法中声明的变量（本地变量）只能在当前方法中被使用
     * <p>
     * 类变量：
     * 在类中定义的静态变量（类变量）可以在当前类的任何地方使用
     * 不是静态的，变量只能在非静态的方法中使用，或者在方法外使用
     */

    public static int sum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum = sum + i;
        }
        // System.out.println(PI); 全局变量方法内也可以使用
        return sum;
    }

    public int sum(int a) {
        int c = T;
        // 没有用static修饰，可以使用T
        return a;
    }
}
