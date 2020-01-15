package Day20;

public class MyThread1 extends Thread {
    private String title;

    public MyThread1(String title) {
        this.title = title;
    }

    @Override
    public void run() {
        // 此过程资源可以被剥夺
        for (int i = 0; i < 10; i++) {
            System.out.println(this.title + ", i=" + i);
        }
    }
}

class Test01 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1("Thread1");
        MyThread1 t2 = new MyThread1("Thread2");
        // start()调用，代表准备就绪，等待分配资源
        t1.start();
        // start()调用，代表准备就绪，等待分配资源
        t2.start();
    }
}