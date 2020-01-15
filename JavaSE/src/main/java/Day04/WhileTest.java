package Day04;

/**
 * @program: Data_Study
 * @description: While 学习
 * @author: HaoMiao
 * @create: 2019-10-26 21:15
 **/
public class WhileTest {
    public static void main(String[] args) {
        /**
         * while(布尔值){代码块(java语句)}
         *
         */
        int i = 1;
        while (i < 5) {
            // ()内判断结果为true就进入代码块执行，为false，就结束退出while循环，往下执行
            System.out.println(i);
            i++;
            // 执行完代码块，返回上面进行布尔值判断
        }

        // 死循环
        int j = 1;
        while (true) {
            System.out.println("第" + j + "打印");
            j++;
        }
    }
}
