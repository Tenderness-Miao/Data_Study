package homework.Day21;

public class Transfer {
    public static void main(String[] args) throws InterruptedException {
        Account[] accounts = new Account[10];
        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account(10000);
        }
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new ThreadMethod(accounts);
            threads[i].start();
        }

        for (int i = 0; i < 10; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("account[" + i + "]=" + accounts[i].getMoney());
            sum += accounts[i].getMoney();
        }
        System.out.println("Sum:" + sum);
    }
}
