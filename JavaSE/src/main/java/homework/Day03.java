package homework;

/**
 * @program: Data_Study
 * @description: Day3 作业
 * @author: HaoMiao
 * @create: 2019-10-20 20:26
 **/
public class Day03 {
    public static void main(String[] args) {
//        score();
//        order();
        switchCase('a');
    }

    private static void score() {
        int score = 91;
        if (score == 100) {
            System.out.println("奖励一台MacBook");
        }
        if (score >= 80 && score <= 99) {
            System.out.println("奖励一部iPhone7");
        }
        if (score >= 60 && score < 80) {
            System.out.println("奖励一个苹果");
        }
        if (score > 100 || score < 60) {
            System.out.println("啥都没有！");
        }
    }

    private static void order() {
        int a = 7, b = 9, c = 11;
        if (a < b) {
            if (a < c) {
                System.out.println("a的值为：" + a);
                if (b < c) {
                    System.out.println("b的值为：" + b);
                    System.out.println("c的值为：" + c);
                } else {
                    System.out.println("c的值为：" + c);
                    System.out.println("b的值为：" + b);
                }
            } else {
                System.out.println("c的值为：" + c);
            }
        } else {
            if (b < c) {
                System.out.println("b的值为：" + b);
                if (a < c) {
                    System.out.println("a的值为：" + a);
                    System.out.println("c的值为：" + c);
                } else {
                    System.out.println("c的值为：" + c);
                    System.out.println("a的值为：" + a);
                }
            } else {
                System.out.println("c的值为：" + c);
            }
        }
    }

    private static void switchCase(char c) {
        switch (c) {
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            case 'e':
                System.out.println("E");
                break;

            default:
                System.out.println("other");
                break;
        }
    }
}
