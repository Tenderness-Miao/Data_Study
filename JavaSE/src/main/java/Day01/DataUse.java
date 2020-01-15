package Day01;

/**
 * @program: Data_Study
 * @description: Java SE Day01
 * @author: HaoMiao
 * @create: 2019-10-16 20:20
 **/
public class DataUse {

    /**
     * 变量使用之前需要声明赋值
     * 变量是可以多次赋值的，这一次的赋值会覆盖上一次的赋值
     * 赋值运算时从右往左的 number=number+2
     * <p>
     * 变量声明的方法有三种：
     * -------------------
     * int a；
     * a = 19;
     * -------------------
     * int a = 10;
     * -------------------
     * int a = 10, b = 11;
     * -------------------
     * int a, b;
     * a = 10;
     * b = 11;
     * -------------------
     * int a, b =10;
     * a = 10;
     * <p>
     * 变量的作用域范围：
     * 在自己的作用域内
     * 1.就近原则
     * 2.看括号
     * <p>
     * <p>
     * 常量的值不能改变，
     * 定义方法：
     * 一：声明赋值同时进行
     * 二：常量名一般使用大写，与变量区分
     * <p>
     * 成员变量（全局变量）
     * 在class里面，方法外面
     */

    int v = 1;

    public static void main(String[] args) {
        // 局部变量
        int v = 10;
        System.out.println(v);

        System.out.println(1);
        // ln=>line
        System.out.println(57);
        System.out.println(1.34);
        //变量
        char ch1 = '我';
        char ch2 = '是';
        String s = "*****";
        System.out.println("我");
        System.out.println("你");
        System.out.println('他');
        System.out.println(ch1 + s);

        int number;
        number = 5;
        System.out.println(number);

        number = number + 2;
        System.out.println(number);

        System.out.println(number + 2);
        System.out.println("---------------------");

        int number2 = 5;
        System.out.println(number + number2);

        // 同时声明多个变量
        int a, b, c;
        a = 10;
        b = 11;
        c = 12;
        System.out.println(a + b + c);

        int a1 = 10, b1 = 11, c1 = 12;
        System.out.println(a1 + b1 + c1);
        // System.out.println(int a=1); 不允许

        System.out.println("-----------------------");

        // 常量
        final int t = 99;
        System.out.println(t);
        System.out.println(t + 10);
        // t = t + 10; 不能改变常量

        final int IT = 99;

    }
}
