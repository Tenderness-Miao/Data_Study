package Day20;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Account account = new Account();
        IncreaseThread increaseThread = new IncreaseThread(account);
        DecreaseThread decreaseThread = new DecreaseThread(account);
        increaseThread.start();
        decreaseThread.start();
        increaseThread.join();
        decreaseThread.join();

        System.out.println(account);
    }
}
