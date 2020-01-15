package Day10;

/**
 * 完善了JAVA多继承机制
 * 每个内部类都可以独立的继承接口或者类
 * 无论外部类是否继承或是实现某个接口，对于内部类没有影响
 * <p>
 * <p>
 * driverCar 需要一个Car对象，我们通过实现接口创建一个匿名的类对象传递过去
 * 匿名对象没有构造方法，唯一一个没有构造方法的内部类
 * 匿名内部类和局部内部类只能访问外部类的final变量
 */
public class K {
    public static void main(String[] args) {
        driverCar(new Car() {
            @Override
            public void drive() {
                System.out.println("驾驶BMW汽车");
            }
        });
    }

    public static void driverCar(Car car) {
        car.drive();
    }
}

interface Car {
    void drive();
}

/**
 * 通过static修饰，不依赖于外部类
 * 静态内部类不能使用外部类的非静态成员变量、成员方法
 */

class U {
    static class I {

    }
}
