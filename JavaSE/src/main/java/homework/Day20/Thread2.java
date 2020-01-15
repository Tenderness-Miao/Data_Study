package homework.Day20;

import static java.lang.Thread.sleep;

public class Thread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                System.out.println("thread2:" + "小白 i=" + i);
                sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
