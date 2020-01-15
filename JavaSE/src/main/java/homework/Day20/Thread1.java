package homework.Day20;

public class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                System.out.println("thread1:" + "小白 i=" + i);
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
