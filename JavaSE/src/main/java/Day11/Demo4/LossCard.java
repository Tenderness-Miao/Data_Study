package Day11.Demo4;

public class LossCard implements BankBusiness {
    @Override
    public String doBusiness(int number) {
        System.out.println("办理挂失");
        return "一星";
    }
}
