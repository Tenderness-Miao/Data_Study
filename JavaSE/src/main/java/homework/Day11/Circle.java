package homework.Day11;

/**
 * @program: Data_Study
 * @description: Day11 Circle类
 * @author: HaoMiao
 * @create: 2019-11-05 22:49
 **/
public class Circle {
    private double radius;
    private double PI = Math.PI;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", PI=" + PI +
                '}';
    }
}
