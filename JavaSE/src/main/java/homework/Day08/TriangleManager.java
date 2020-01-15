package homework.Day08;

/**
 * @program: Data_Study
 * @description: Day08 TriangleManager类
 * @author: HaoMiao
 * @create: 2019-10-30 22:06
 **/
public class TriangleManager {
    public static void getArea(Triangle t) {
        double area = 0;
        area = (t.getBase() * t.getHeight()) / 2;
        System.out.println("三角形面积为：" + area);
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setBase(2.0);
        triangle.setHeight(4.0);
        TriangleManager.getArea(triangle);
    }
}
