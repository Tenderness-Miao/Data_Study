package Day05;

/**
 * @program: Data_Study
 * @description: 方法重载
 * @author: HaoMiao
 * @create: 2019-10-26 23:12
 **/
public class MethodRel {
    /**
     * 方法名可以被多个方法使用，但是相同方法名的方法内参数列表不能相同
     * 参数列表不同：参数类型 参数的个数（形参名没有实际意义，不参与判断）可以不完全一样
     */
    public static void printT(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }

    public static int max(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static int max(int a, int b, char c) {
        return 1;
    }

    public static void main(String[] args) {
        printT(10000);
        printT(16);
    }
}
