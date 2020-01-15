package Day04;

/**
 * @program: Data_Study
 * @description: do while学习
 * @author: HaoMiao
 * @create: 2019-10-26 21:20
 **/
public class DoWhileTest {
    /**
     * do{代码块(java语句)} while(布尔值)
     * 代码块至少执行一次
     */
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
    }
}
