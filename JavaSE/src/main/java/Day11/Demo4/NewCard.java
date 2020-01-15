package Day11.Demo4;

public class NewCard implements BankBusiness {
    @Override
    public String doBusiness(int number) {
        System.out.println("银行开户");
        return "五星好评";
    }
}
