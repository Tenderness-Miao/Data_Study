package Day20;

public class ThreadMethod03 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyThread2("100"));
        t1.start();
        Thread.sleep(10);

        // 终止t1执行，杀死t1
        t1.stop();
    }
}
