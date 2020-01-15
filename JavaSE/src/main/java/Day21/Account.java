package Day21;

public class Account {
    private int money = 100;

    public synchronized void decrease() {
        // 同步方法锁的是调用此方法的对象，就是this
        /**
         * 同步代码块粒度更细
         * 可以专门对会产生线程安全的艾玛块加锁
         * 同步方法，会对整个方法加锁
         */
        money--;
        System.out.println("当前余额：" + money);
    }

    public synchronized void increase() {
        money++;
        System.out.println("当前余额：" + money);
    }

    @Override
    public String toString() {
        return "Account{" +
                "money=" + money +
                '}';
    }
}
