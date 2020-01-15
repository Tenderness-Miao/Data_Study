package homework.Day11;

/**
 * @program: Data_Study
 * @description: Day11 AreaComparatorTest类
 * @author: HaoMiao
 * @create: 2019-11-05 23:07
 **/
public class AreaComparatorTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(3, 4);
        Triangle triangle = new Triangle(2, 5);

        AreaComparator areaComparator = new AreaComparator();

        System.out.println("图形面积较大的是：" + areaComparator.compareArea(circle, rectangle));
        System.out.println("--------------------------------------------------------------");
        System.out.println("图形面积较大的是：" + areaComparator.compareArea(circle, triangle));
        System.out.println("--------------------------------------------------------------");
        System.out.println("图形面积较大的是：" + areaComparator.compareArea(rectangle, triangle));
    }
}
