package Day11.Demo4;

public class Test {
    public static void main(String[] args) {
        BankBusinessTemplate template = new BankBusinessTemplate();
        // 多态
        BankBusiness b1 = new NewCard();
        template.business(b1);

        // 多态
        BankBusiness b2 = new ChanggePhoneNumber();
        template.business(b2);
    }
}
