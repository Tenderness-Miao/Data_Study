package Day11.Demo3;

public class NewCard extends BankBusinessTemplate {
    @Override
    protected String business() {
        System.out.println("银行开户");
        return "五星好评";
    }
}
