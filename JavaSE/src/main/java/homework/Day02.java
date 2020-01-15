package homework;

/**
 * @program: Data_Study
 * @description: day2 作业
 * @author: HaoMiao
 * @create: 2019-10-19 23:28
 **/
public class Day02 {
    public static void main(String[] args) {
        transform();
        System.out.println("----------------------");
        compare();
        System.out.println("----------------------");
        compareCircularArea();
    }

    private static void transform() {
        int mins = 150;
        System.out.println(mins + "分钟可以转换为" + (mins / 60) + "小时" + (mins % 60) + "分钟");
    }

    private static void compare() {
        int a = 1234, b = 12345;
        int max = a > b ? a : b;
        System.out.println(max);
    }

    private static void compareCircularArea() {
        final double PI = 3.1415927;
//        final double PI2 = Math.PI;
        int a = 5;
        int b = 10;
        double a_area = PI * (a * a);
        double b_area = PI * (b * b);

        double a_perimeter = 2 * PI * a;
        double b_perimeter = 2 * PI * b;

//        System.out.println("半径为5的圆形周长为：" + (2 * PI * a));
//        System.out.println("半径为10的圆形周长为：" + (2 * PI * b));
//
//        System.out.println("半径为5的圆形面积为：" + a_area);
//        System.out.println("半径为10的圆形面积为：" + b_area);

        System.out.println("最大的圆面积为：" + (a_area > b_area ? a_area : b_area));

    }
}
