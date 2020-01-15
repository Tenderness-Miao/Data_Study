package Day10;

/**
 * 接口可以被理解为纯粹的抽象类，接口里的所有方法都是抽象的
 * 接口不能被实例化
 * 关键字 interface
 * <p>
 * 接口描述了一个功能
 * 接口默认修饰符 public abstract
 */
public interface Flyable {
    // 接口的中的变量总是public static final修饰的，不允许private修饰
    int meter = 0;
    String s = null;

    void fly();
}

interface runnable {
    void run();
}

/**
 * 类与接口直接可以有实现关系
 * 用一个类去实现这个功能
 * 关键词implement
 * 一个类如果实现这个接口就必须实现接口里面的所有方法
 * 实现一个接口必须实现接口里的所有方法，否则这个类就必须声明为抽象类
 * 接口可以多实现
 */

class AirPlane implements Flyable, runnable {
    @Override
    public void fly() {
        System.out.println("飞机能飞");
    }

    @Override
    public void run() {
        System.out.println("飞机在跑道上跑");
    }
}

/**
 * 接口与接口之间可以集成（类与接口之间可以实现）
 * 接口之间可以多继承
 */

interface jump extends runnable, Flyable {
    void jumping();
}

// 一个类要实现一个接口，那么这个类就必须实现这个接口继承的所有接口
class Test2 implements jump {
    @Override
    public void fly() {
        System.out.println("飞起来");
    }

    @Override
    public void run() {
        System.out.println("跑起来");
    }

    @Override
    public void jumping() {
        System.out.println("跳起来");
    }
}

class Test1 {
    public static void main(String[] args) {
        AirPlane airPlane = new AirPlane();
        airPlane.fly();
        Test2 test2 = new Test2();
        test2.run();
        test2.fly();
        test2.jumping();
    }
}