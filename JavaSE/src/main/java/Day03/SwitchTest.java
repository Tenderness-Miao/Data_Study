package Day03;

/**
 * @program: Data_Study
 * @description: switch语句
 * @author: HaoMiao
 * @create: 2019-10-20 18:26
 **/
public class SwitchTest {
    /**
     * switch 语句会在几个选项中做出选择
     */
    public static void main(String[] args) {
        int num = 5;
        switch (num) {
            // 只能使用char、byte、short、int、String和枚举
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            default:
                // 如果上面的值都没有匹配上，那么就执行default后面的代码
                System.out.println("default");
                break;
        }

        System.out.println("-------------------------------");

        String c = "sdfe";
        switch (c) {
            case "sdfe":
                System.out.println("1");
                break;
            case "dfa":
                System.out.println("2");
                break;
            case "dfe":
                System.out.println("3");
                break;
            default:
                System.out.println("其他字符串");
                break;
        }

        long l = 15;
//         switch(l){   编译时出错，不允许long类型
//             case 1:
//                 System.out.println("1");
//                 break;
//         }

        int i = 18;
        final int j = 18;
        switch (i) {
//            case j:
//                System.out.println("i=j");  case的值必须是常量
//                break;
//            case j=17:
//                System.out.println("i!=j"); case的值不能用表达式
            case j:
                System.out.println("case的值是能是常量");
            default:
                break;
        }
    }
}
