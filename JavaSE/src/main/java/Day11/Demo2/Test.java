package Day11.Demo2;

public class Test {
    /**
     * 代理模式可以在不改变源码的情况下，对目标对象进行访问控制和功能扩展
     * 1.目标对象：实际完成功能的对象
     * 2.代理对象：是目标对象的替身
     * 3.客户
     */

    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.work();
    }
}
