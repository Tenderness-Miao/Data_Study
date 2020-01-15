package Day20;

public class ThreadMethod01 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            /**
             * sleep()方法让当前线程睡眠1000毫秒
             * 调用sleep方法会让出cpu的执行权（资源），睡眠1000ms以后参与争取执行资源
             */
            Thread.sleep(1000);
        }
    }
}
