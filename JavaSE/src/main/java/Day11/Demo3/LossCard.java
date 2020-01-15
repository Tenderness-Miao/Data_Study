package Day11.Demo3;

public class LossCard extends BankBusinessTemplate {
    @Override
    protected String business() {
        System.out.println("办理挂失");
        return "一星";
    }
}
