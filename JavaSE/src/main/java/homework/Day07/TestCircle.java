package homework.Day07;

/**
 * @program: Data_Study
 * @description: Circle类作业
 * @author: HaoMiao
 * @create: 2019-10-30 20:31
 **/
public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 2;
        System.out.println("半径为2的圆面积为：" + circle.getArea(circle.radius));
    }
}
