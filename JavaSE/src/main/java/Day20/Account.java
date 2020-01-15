package Day20;

public class Account {
    private int money=100;
    public void decrease(){
        synchronized (this){
            money--;
            System.out.println("当前余额："+money);
        }
    }
    public void increase(){
        synchronized (this){
            money++;
            System.out.println("当前余额："+money);
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "money=" + money +
                '}';
    }
}
