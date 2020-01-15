package Day11.Demo4;

import java.util.Random;

public class BankBusinessTemplate {
    // 取号
    protected int takeNumber() {
        Random r = new Random();
        int i = r.nextInt(1000);
        System.out.println("取到号码：" + i);
        return i;
    }

    // 业务
    public void business(BankBusiness bs) {
        // 取号
        int number = takeNumber();
        // 办理业务
        String s = bs.doBusiness(number);
        // 保存评价
        saveEvaluate(number, s);
    }

    // 保存评价
    protected void saveEvaluate(int number, String evaluate) {
        System.out.println("号码" + number + "的评价是：" + evaluate);
    }
}
