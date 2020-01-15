package homework.Day13;

import java.util.Scanner;

/**
 * @program: Data_Study
 * @description: 帐号验证
 * @author: HaoMiao
 * @create: 2019-11-16 20:22
 **/
public class MainApp {
    private static String checkAccount(String account) {
        boolean result = false;
        if (account.matches("^[a-z|A-Z]\\d{11}")) {
            result = true;
        }
        return result ? "帐号校验通过" : "帐号校验不通过";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入帐号：");
        String account = scanner.next();
        System.out.println(checkAccount(account));
    }
}
