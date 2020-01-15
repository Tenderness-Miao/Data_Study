package Day02;

/**
 * @program: Data_Study
 * @description: 逻辑运算符
 * @author: HaoMiao
 * @create: 2019-10-20 15:04
 **/
public class Operation4 {
    public static void main(String[] args) {
        /**
         * && 短路与
         * || 短路或
         * & 与
         * | 或
         * ^ 异或
         * ! 非
         */
        // 短路与操作符&&    如果第一个值已经能够确定结果，那么后面就不执行了
        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println("----------------");

        // 短路或操作符||
        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println("-----------------");

        // 非短语的 不管判断结果是否确定，都将代码执行完
        // 不短路与操作符&
        System.out.println(true & true);
        System.out.println(false & true);
        System.out.println(true & false);
        System.out.println(false & false);

        System.out.println("------------------");

        // 不短路或操作符|
        System.out.println(true | true);
        System.out.println(false | true);
        System.out.println(true | false);
        System.out.println(false | false);

        System.out.println("------------------");

        int i = 10;
        System.out.println(true || ++i == 11);
        System.out.println(i);
        // 10
        System.out.println(false || ++i == 11);
        System.out.println(i);

        System.out.println("------------------");

        System.out.println(false && ++i == 11);
        System.out.println(i);
        System.out.println(true && ++i == 11);
        System.out.println(i);

        System.out.println("------------------");

        int j = 10;
        System.out.println(true | ++j == 11);
        System.out.println(j);
        // 11
        System.out.println(false | ++j == 11);
        System.out.println(j);

        System.out.println("------------------");

        System.out.println(false & ++j == 11);
        System.out.println(j);
        System.out.println(true & ++j == 11);
        System.out.println(j);

        // 异或 ^ 操作符两边结果相同为false，不相同为true： （异一）
        System.out.println(true ^ true);
        System.out.println(false ^ true);

        // 非 取相反结果
        System.out.println(!true);
    }
}
