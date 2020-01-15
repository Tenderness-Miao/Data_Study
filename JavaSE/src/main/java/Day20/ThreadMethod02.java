package Day20;

public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyThread2("线程1"));
        Thread t2 = new Thread(new MyThread2("线程2"));
        Thread t3 = new Thread(new MyThread2("线程3"));
        t1.start();
        t2.start();
        // 让当前现场等待t2执行结束，再恢复执行
        t2.join();
        System.out.println("主线程恢复执行");
        t3.start();
    }
}
