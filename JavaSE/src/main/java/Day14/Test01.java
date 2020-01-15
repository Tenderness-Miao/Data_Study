package Day14;

public class Test01 {
    // 异常可以传播
    public static void main(String[] args) {
        method1();
        System.out.println("调用完method1");
    }

    public static void method1() {
        method2();
        System.out.println("调用完method2");
    }

    public static void method2() {
        try {
            // 写觉得可能有异常的代码
            String str = "asdf";
            // 空指针异常
            System.out.println(str.toString());
        } catch (Exception e) {
            System.out.println("逮到异常");
        } finally {
            // 无论捕获到或者没有捕获到异常，最后都会执行里边的代码
        }
        // 异常下边的异常不能执行，因为异常会导致执行终止
        System.out.println("空指针异常");
    }
}
