package Day05;

/**
 * @program: Data_Study
 * @description: 方法的引入
 * @author: HaoMiao
 * @create: 2019-10-26 21:43
 **/
public class Test {
    public static void main(String[] args) {
        int a = 11, b = 12, c = 13;
        int max = 0;
        int mid = 0;
        int min = 0;

        // 求出三个数中最大的值
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }

        // 求出三个数的中间值
        if (a >= b && a <= c) {
            mid = a;
        } else if (a >= c && a <= b) {
            mid = a;
        } else if (b >= a && b <= c) {
            mid = b;
        } else if (b <= a && b >= c) {
            mid = b;
        } else {
            mid = c;
        }

        // 求出三个数中的最小值
        if (a <= b && a < c) {
            min = a;
        } else if (b <= a && b <= c) {
            min = b;
        } else {
            min = c;
        }

        // 比较三个数的大小
        /**
         * 复用代码----> 函数，方法  下次用的时候直接调用
         */

        int max1 = max(10, 20, 30);
        int max2 = max(99, 98, 100);
        int mid1 = mid(11, 22, 68);
        int min1 = min(98, 29, 28);
        System.out.println(max1);
        System.out.println(max2);
        System.out.println(mid1);
        System.out.println(min1);

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

    public static int mid(int a, int b, int c) {
        if (a >= b && a <= c) {
            return a;
        } else if (a >= c && a <= b) {
            return a;
        } else if (b >= a && b <= c) {
            return b;
        } else if (b <= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static int min(int a, int b, int c) {
        if (a <= b && a < c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }
}
