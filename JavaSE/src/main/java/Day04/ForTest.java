package Day04;

/**
 * @program: Data_Study
 * @description: for 学习
 * @author: HaoMiao
 * @create: 2019-10-26 21:21
 **/
public class ForTest {
    /**
     * for(初始化语句;条件表达式;操作语句){Java代码块};
     * 初始化语句：int i = 0; 只执行一次
     * 条件语句：i < 5 (布尔值)每执行一次代码块，就会判断一次（除第一次以外）。判断为true就在执行一次代码块，false就不执行
     * 操作语句：i++; 每次执行完代码块，都会执行一次操作语句
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // ()括号内三个部分都不是必须的，但是 ；是必须的
            System.out.println("第" + i + "次打印");
        }
        /**
         * 1.执行初始化语句，i = 0；
         * 2.执行条件语句，判断i是不是小于10；结果为true
         * 3.执行代码块，打印输出：第0次打印
         * 4.执行操作语句，i++ 此时i == 1；
         *  1.执行判断语句，判断i是不是小于10；结果为true
         *  2.执行代码块，打印输出：第1次打印
         *  3.执行操作语句，i++ 此时i == 2；
         *      。。。。。。
         *      1.执行判断语句，判断i = 10，不小于10，结果为false
         *      2.整个for循环结束；
         */
        /**
         * i=1时进入第二层for循环，循环9次
         * i=2时进入第二层for循环，循环9次
         * 。。。。。。
         * i=10时判断为false，结束
         */

        for (int i = 1; i < 10; i++) {
            System.out.println("这是第" + i + "章");
            for (int j = 0; j < 10; j++) {
                System.out.println("    这是" + i + "_" + j + "节");
            }
        }

        System.out.println("-----------------------------");
        int i = 1;
        int j = 1;
        while (i < 10) {
            System.out.println("这是第" + i + "章");
            while (j < 10) {
                System.out.println("    这是" + i + "_" + j + "节");
                j++;
            }
            j = 1;
            i++;
        }
    }
}
