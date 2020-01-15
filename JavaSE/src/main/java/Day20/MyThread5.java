package Day20;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyThread5 implements Callable {
    // Callable实现多线程
    // 使用Callable定义线程主体类
    private int ticket = 10;

    @Override
    public Object call() throws Exception {
        while (this.ticket > 0) {
            System.out.println("剩余票数：" + this.ticket--);
        }
        return "票卖完了";
    }
}

/**
 * 要把一个Callable对象启动，核心类FutureTask，
 * 它既是Runnable的子类也是Future的子类，
 * 但是它能传进来一个Callable对象
 * 所以FutureTask这个类打通了Thread类和MyThread类
 */

class Test5 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> task = new FutureTask<>(new MyThread5());
        new Thread(task).start();
        new Thread(task).start();
        new Thread(task).start();
        System.out.println(task.get());
    }
}
