package Day01;

/**
 * @program: Data_Study
 * @description: 类型转换
 * @author: HaoMiao
 * @create: 2019-10-16 22:11
 **/
public class Transform {
    public static void main(String[] args) {
        int a = 3;
        // 隐式转换
        long b = a;
        System.out.println(b);
        double c = b;
        System.out.println(c);

        System.out.println("---------------");
        int d = 1;
        boolean e = true;
//        System.out.println(d + e); 编译错误

        int num = 10;
        String s = "我";
        String s1 = "岁";
        System.out.println(s + num + s1);
        System.out.println(s + num + 1 + s1);
        System.out.println(s + (num + 1) + s1);

        // 强制转换
        long number = 1999999;
        int number2 = (int) number;
        System.out.println(number2);

        long g = (int) 36.2;
        // 丢失小数部分
        System.out.println(g);

        int H = 300;
        byte small = (byte) H;
        // 只取低八位
        System.out.println(small);

        float v = 36.01f;
        // 强制转换慎用
    }
}
