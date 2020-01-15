package Day11.Demo1;

/**
 * 单例模式只允许创建一个实例
 * static：同类一起加载
 * Static：只加载一次
 * <p>
 * 软件运行过程中会创建很多对象，创建对象的过程会消耗大量内存空间
 * 使用单例模式可以减少内存开销
 */

class SingletonDemo {
    private static SingletonDemo instance = new SingletonDemo();

    private SingletonDemo() {
    }

    public static SingletonDemo getInstance() {
        return instance;
    }
}

public class Test {
    public static void main(String[] args) {
        SingletonDemo i1 = SingletonDemo.getInstance();
        SingletonDemo i2 = SingletonDemo.getInstance();
        System.out.println(i1);
        System.out.println(i2);
    }
}
