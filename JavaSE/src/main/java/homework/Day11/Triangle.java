package homework.Day11;

/**
 * @program: Data_Study
 * @description: Day11 Triangle类
 * @author: HaoMiao
 * @create: 2019-11-05 22:49
 **/
public class Triangle {
    private double side;
    private double height;

    public Triangle() {
    }

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side=" + side +
                ", height=" + height +
                '}';
    }
}
