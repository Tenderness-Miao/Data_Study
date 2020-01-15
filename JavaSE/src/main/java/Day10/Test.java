package Day10;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        // 声明抽象类：
        // 1.如果抽象类里有抽象方法，一定要重写抽象方法，才能实例化
        // 2.如果抽象类中没有抽象方法，不能实例化
        // DrawGraph drawGraph = new DrawGraph();
    }
}
// 抽象方法只能在抽象类中，抽象类不一定有抽象方法
// 抽象类天生就是用来被继承的，具体的功能由子类来实现

/**
 * 抽象类 抽象方法用Abstract关键词来声明，
 * 1.声明为抽象类
 * 如果抽象类里有抽象方法，一定要重写抽象方法，才能实例化
 * 如果抽象类中没有抽象方法，不能实例化
 * 2.声明抽象方法
 * 不能有方法体
 * <p>
 * 如果一个类包含了抽象方法，那么这个类一定是抽象类
 * 如果一个类继承了抽象类，那么一定要实现里面的抽象方法
 * 定义抽象方法的意义在于：给所有子类指定一定的规则，子类必须要实现抽象方法
 */

abstract class DrawGraph {
    private int x;
    private int y;
    private String color;

    public DrawGraph(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public DrawGraph() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void show() {
        System.out.println("x=" + x + ",y=" + y);
    }

    // 抽象方法不需要方法体
    public abstract void draw();
}

class Circle extends DrawGraph {
    private int radius;

    @Override
    public void draw() {
        System.out.println("画了一个圆形");
    }
}

class Triangle extends DrawGraph {
    private int base;
    private int height;

    @Override
    public void draw() {
        System.out.println("画了一个三角形");
    }
}