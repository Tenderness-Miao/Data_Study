package Day20;

public class ThreadMethod04 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("t被中断了");
                break;
            } else {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

class Test04 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new ThreadMethod04());
        t.start();
        Thread.sleep(100);
        // 打断t，设置t1的中断标志位true
        // 使用interrupt中断的线程，可以选择继续执行，或者停止执行
        t.interrupt();
    }
}
