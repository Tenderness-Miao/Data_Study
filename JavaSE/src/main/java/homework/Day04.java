package homework;

/**
 * @program: Data_Study
 * @description: Day04 作业
 * @author: HaoMiao
 * @create: 2019-10-22 22:13
 **/
public class Day04 {
    public static void main(String[] args) {
//        multiplication();
        sum();
    }

    private static void multiplication() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }

    private static void sum() {
        double sum = 0;
        double a = 0;
        for (double i = 0; i < 5; i++) {
            a += (Math.pow(10, i));
            sum += 2 * a;
            if (i == 4) {
                System.out.println("2 + 22 + 222 + 2222 + 22222 = " + (int) sum);
            }
        }


//            2 = 2 * 1 = 2 * (10 ^ 0)
//            22 = 2 * 11 = 2 (10 ^ 1 + 10 ^ 0)
//            222 = 2 * 111 = 2 (10 ^ 2 + 10 ^ 1 + 10 ^ 0)
//            2222 = 2 * 1111 = 2 (10 ^ 3 + 10 ^ 2 + 10 ^ 1 + 10 ^ 0)
//            22222 = 2 * 11111 = 2 (10 ^ 4 + 10 ^ 3 + 10 ^ 2 + 10 ^ 1 + 10 ^ 0)
    }
}
