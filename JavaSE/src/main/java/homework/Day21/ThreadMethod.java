package homework.Day21;

import java.util.Random;

public class ThreadMethod extends Thread {
    private Account[] accounts;
    Random random = new Random();

    public ThreadMethod(Account[] accounts) {
        this.accounts = accounts;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (accounts) {
                int from = random.nextInt(10);

                int to = random.nextInt(10);
                int money = random.nextInt(1000);
                System.out.println("From:" + from + "To:" + to + "Money:" + money);

                if (accounts[from].getMoney() < money) {
                    System.out.println("余额不足，不能转账");
                    continue;
                }
                accounts[from].setMoney(accounts[from].getMoney() - money);
                accounts[to].setMoney(accounts[to].getMoney() + money);
            }
        }
    }
}
