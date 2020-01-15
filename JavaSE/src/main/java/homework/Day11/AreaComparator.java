package homework.Day11;

/**
 * @program: Data_Study
 * @description: Day11 AreaComparatorTest类
 * @author: HaoMiao
 * @create: 2019-11-05 23:00
 **/
public class AreaComparator implements Areable {
    @Override
    public Object compareArea(Circle circle, Triangle triangle) {
        double circleAre = circle.getPI() * Math.pow(circle.getRadius(), 2);
        double triangleArea = triangle.getHeight() * triangle.getSide() / 2;

        return circleAre > triangleArea ? circle : triangle;
    }

    @Override
    public Object compareArea(Circle circle, Rectangle rectangle) {
        double circleAre = circle.getPI() * Math.pow(circle.getRadius(), 2);
        double rectangleArea = rectangle.getLength() * rectangle.getWidth();

        return circleAre > rectangleArea ? circle : rectangle;
    }

    @Override
    public Object compareArea(Rectangle rectangle, Triangle triangle) {
        double rectangleArea = rectangle.getLength() * rectangle.getWidth();
        double triangleArea = triangle.getHeight() * triangle.getSide() / 2;

        return rectangleArea > triangleArea ? rectangle : triangle;
    }
}
