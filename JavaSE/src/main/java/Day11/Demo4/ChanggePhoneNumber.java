package Day11.Demo4;

public class ChanggePhoneNumber implements BankBusiness {
    @Override
    public String doBusiness(int number) {
        System.out.println("修改手机号");
        return "五星好评";
    }
}
