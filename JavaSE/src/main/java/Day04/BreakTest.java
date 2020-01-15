package Day04;

/**
 * @program: Data_Study
 * @description: break continue 学习
 * @author: HaoMiao
 * @create: 2019-10-26 21:33
 **/
public class BreakTest {
    /**
     * break：结束本次代码块，并且终止循环
     * continue：结束本次代码块，继续下次循环操作
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }

        System.out.println("--------------------");

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("--------------------");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5) {
                continue;
            }
        }

        System.out.println("--------------------");

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }

}
