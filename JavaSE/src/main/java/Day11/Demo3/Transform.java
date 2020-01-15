package Day11.Demo3;

public class Transform extends BankBusinessTemplate {
    @Override
    protected String business() {
        System.out.println("转载1000000000元");
        return "五星好评";
    }
}
