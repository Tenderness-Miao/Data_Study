package Day02;

/**
 * @program: Data_Study
 * @description: 算数运算符
 * @author: HaoMiao
 * @create: 2019-10-20 12:58
 **/
public class Operation {
    /**
     * 加：+
     * 减：-
     * 乘：*
     * 除：/  %
     */
    // 算数运算符
    public static void main(String[] args) {
        int a = 5;
        // a = a + 5;
        a += 5;
        System.out.println(a);
        a *= 10;
        // a = a * 10;
        System.out.println(a);
        a /= 5;
        // a = a / 5;
        System.out.println(a);
        // 20 ---------- 取整（取模）

        System.out.println(a %= 5);
        // 0 ----------- 取余运算
        System.out.println(101 % 5);
        // 1
        // 判断一个数能不能被整除
        System.out.println("-----------------------");

        // + - 特别用法
        // 字符拼接
        System.out.println("hello" + "world");
        System.out.println("hell0" + 2);
        // +号作为单目运算时表示正数
        System.out.println(+2);
        // -号作为单目运算时表示负数
        System.out.println(-2);
    }
}
