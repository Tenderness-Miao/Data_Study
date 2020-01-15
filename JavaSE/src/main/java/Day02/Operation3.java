package Day02;

/**
 * @program: Data_Study
 * @description: 比较运算符
 * @author: HaoMiao
 * @create: 2019-10-20 14:54
 **/
public class Operation3 {
    public static void main(String[] args) {
        /**
         * 判断符号：
         * 大于： >
         * 小于： <
         * 等于： ==
         * 不等于： !=
         * 大于等于： >=
         * 小于等于： <=
         */
        System.out.println(1 > 2);
        // false 假
        System.out.println(1 < 2);
        // true 真
        System.out.println("---------------");

        int a = 1;
        int b = 1;
        System.out.println(a == b);
        boolean c = a == b;
        System.out.println(c);
        // 把一个Boolean值赋值给c（true）

        System.out.println(a != b);
        System.out.println(a >= b);
        System.out.println("----------------");
    }
}
