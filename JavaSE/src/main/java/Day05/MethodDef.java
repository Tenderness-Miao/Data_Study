package Day05;

/**
 * @program: Data_Study
 * @description: 方法传递参数
 * @author: HaoMiao
 * @create: 2019-10-26 22:12
 **/
public class MethodDef {

    public static void printT() {
        // 打印一个三角形
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
        return;
    }

    public static void printT(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }

    public static void printT(int n, char c) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(c);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printT();
        printT(10);
        printT(18, '@');
    }
}
