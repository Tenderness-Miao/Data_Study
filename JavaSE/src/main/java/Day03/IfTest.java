package Day03;

/**
 * @program: Data_Study
 * @description: if语句
 * @author: HaoMiao
 * @create: 2019-10-20 17:47
 **/
public class IfTest {
    /**
     * if(boolean值-->条件语句)｛……java语句｝
     * 如果boolean == true，就会执行｛｝内的java语句
     * 1.if(true/false){java语句}
     * <p>
     * 2.if(boolean值){java语句}else{java语句}
     * <p>
     * 3.if(){java语句}else if(){java语句}else if(){}else.....
     * <p>
     * 4.if(){java语句}else if(){java语句}else if(){}
     * <p>
     * if可以嵌套使用
     * if(){
     * if(){
     * if(){
     * <p>
     * }
     * }
     * }
     */
    public static void main(String[] args) {
        /**
         * if(){}
         * ()内结果要么为true，要么为false
         * 为true就进入｛｝执行java语句
         * 如果为false就往下执行else或者下一句java代码
         */
        if (true) {
            System.out.println("这个条件满足");
        }
        if (false) {
            System.out.println("这个条件不满足");
        }

        System.out.println("-----------------");

        if (false) {
            System.out.println("&&&");
        } else {
            System.out.println("我来这里了");
        }

        System.out.println("-----------------");

        int a = 10;
        if (a == 10) {
            System.out.println("a = 10");
        } else {
            System.out.println("a != 10");
        }

        if (a == 9) {
            System.out.println("a = 9");
        } else {
            System.out.println("a != 9");
        }

        if (a == 9) {
            System.out.println("a = 9");
        } else if (a == 8) {
            System.out.println("a = 8");
        } else if (a == 7) {
            System.out.println("a = 7");
        } else {

        }

        /**
         * 考试分数60及以上几个，60以下不及格
         * 60以上：
         *      60-70：良
         *      70-80：优
         *      80-90：牛
         *      90-99：王者
         *      100：牲口
         * 60以下：
         *      不及格
         */

        System.out.println("------------------------------------");
        int score = 101;
        if (score >= 60 && score < 70) {
            System.out.println("良");
        }
        if (score >= 70 && score < 80) {
            System.out.println("优");
        }
        if (score >= 80 && score < 90) {
            System.out.println("牛");
        }
        if (score >= 90 && score < 99) {
            System.out.println("王者");
        }
        if (score == 100) {
            System.out.println("牲口");
        }
        if (score < 60) {
            System.out.println("不及格");
        }

        System.out.println("------------------------------------");

        if (score >= 60) {
            if (score >= 70) {
                if (score >= 80) {
                    if (score >= 90) {
                        if (score == 100) {
                            System.out.println("牲口");
                        } else {
                            System.out.println("王者");
                        }
                    } else {
                        System.out.println("牛");
                    }
                } else {
                    System.out.println("优");
                }
            } else {
                System.out.println("良");
            }
        } else if (score < 0) {
            System.out.println("不可能");
        } else {
            System.out.println("不及格");
        }
    }
}
