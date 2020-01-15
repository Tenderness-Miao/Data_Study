package Day04;

/**
 * @program: Data_Study
 * @description: 循环举例
 * @author: HaoMiao
 * @create: 2019-10-26 21:37
 **/
public class Test {
    /**
     * 求1-100的和
     */
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; i < 100; i++) {
            // ((0+1+2)+3)+4
            total = total + i;
            System.out.println("1-" + i + "的和为：" + total);
        }
        System.out.println("1-100的和为：" + total);

        /**
         * 打印1-100的偶数
         */
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        /**
         * 一个294005280米的绳子，每天截断一半，问多少天这个绳子会小于5米；
         */
        double rope = 294005280;
        int day = 0;
        while (rope > 5) {
            rope = rope / 2;
            day++;
        }
        System.out.println("总共花了" + day + "天");
    }
}
