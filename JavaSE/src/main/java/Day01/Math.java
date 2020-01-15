package Day01;

/**
 * @program: Data_Study
 * @description: 运算符
 * @author: HaoMiao
 * @create: 2019-10-16 21:28
 **/
public class Math {
    public static void main(String[] args) {
        // 声明变量
        int value = 10;
        int value2;
        value2 = value * value;
        System.out.println(value2);

        System.out.println(value2 * value);

        int a = 10;
        int b = 12;
//        a = b;
        System.out.println(a + "----------" + b);
        System.out.println("--------------");

        // 除法/  取余%
        System.out.println(b % a);
        System.out.println(b / a);

        System.out.println("-------------------");
        // 基本类型的取值范围的举例
        System.out.println(2147483647 + 2);
        System.out.println(2147483647L + 2);

        float f = 5.0f;

        System.out.println(true);
    }

}
