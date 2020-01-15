package Day05;

/**
 * @program: Data_Study
 * @description: 方法的返回值
 * @author: HaoMiao
 * @create: 2019-10-26 23:07
 **/
public class MethodRe {
    /**
     * return:
     * 返回对应的返回值类型的数据：return 值（形参，表达式）；
     * void类型：
     * 1.return ；结束方法；
     * 2.不写： 继续往下执行；
     */
    // 如果返回值类型不是void 那么一定要谢return！！！！
    // return后边跟数据类型一定要和定义方法时写的返回值数据类型一致！！！变异错误

    public static int sum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum = sum + i;
        }
        // return 10;返回10
        return sum;
    }

    public static void printS() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println(i);
                // return; 直接结束方法
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 10));
        printS();
    }
}
