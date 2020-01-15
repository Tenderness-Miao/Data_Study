package Day20;

/**
 * 1.实现Runnable接口，实现run()方法
 * 2.创建Thread对象，用实现的Runnable接口的对象作为参数实例化Thread对象
 * 3.调用Thread的start()方法
 */
public class MyThread2 implements Runnable {
    private String title;

    public MyThread2(String title) {
        this.title = title;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(this.title + ",i=" + i);
        }
    }
}

class Test2 {
    public static void main(String[] args) {
        MyThread2 runnable1 = new MyThread2("Thread1");
        MyThread2 runnable2 = new MyThread2("Thread2");
        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable2);
        t1.start();
        t2.start();
    }
}
