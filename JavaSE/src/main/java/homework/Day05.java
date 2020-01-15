package homework;

/**
 * @program: Data_Study
 * @description: day05 作业
 * @author: HaoMiao
 * @create: 2019-10-26 12:11
 **/
public class Day05 {
    public static void main(String[] args) {
        System.out.println("10的阶乘为：" + factorial(10));
        System.out.println("------------------------------");
        int a = 10, b = 199, c = 231;
        int max1 = compareMax(a, b);
        int max2 = compareMax(a, c);
        System.out.println("a = 10, b = 199, c = 231, 最大值为：" + compareMax(max1, max2));
        System.out.println("------------------------------");
        float perimeter = 100;
        System.out.println(compare(perimeter));
        double area = 1000;
        System.out.println(compare(area));
    }

    private static String compare(float perimeter) {
        // 正方形周长转面积：(perimeter/4)^2
        double squareArea = Math.pow((perimeter / 4), 2);
        // 圆周长转面积：((perimeter/2PI)^2)*PI
        double roundArea = Math.pow((perimeter / (2 * Math.PI)), 2) * Math.PI;

        return squareArea > roundArea ? "相同周长，正方形面积大于圆面积，面积为：" + squareArea :
                "相同周长，圆面积大于正方形面积，面积为：" + roundArea;
    }

    private static String compare(double area) {
        // 正方形面积转周长：sqrt(area)*4
        double squarePerimeter = Math.sqrt(area) * 4;
        // 正三角形面积转周长：sqrt(4*area/sqrt(3))*3
        double trianglePerimeter = Math.sqrt((4 * area) / Math.sqrt(3)) * 3;

        return squarePerimeter > trianglePerimeter ? "相同面积，正方形周长大于正三角形周长，周长为：" + squarePerimeter :
                "相同面积，正三角形周长大于正方形周长，周长为：" + trianglePerimeter;
    }

    private static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    private static int compareMax(int a, int b) {
        return a > b ? a : b;
    }

}
