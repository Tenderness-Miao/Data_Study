package Day11.Demo3;

import javax.swing.text.Style;
import java.util.Random;

public abstract class BankBusinessTemplate {
    /**
     * 1.排号
     * 2.办理业务
     * 3.评价
     * 使用抽象类的模版模式
     */
    // 取号
    protected int takeNumber() {
        Random r = new Random();
        int i = r.nextInt(1000);
        System.out.println("取到号码：" + i);
        return i;
    }

    // 具体业务，声明为抽象方法，交给子类实现
    protected abstract String business();

    // 保存评价
    protected void saveEvaluate(int number, String evaluate) {
        System.out.println("号码" + number + "的评价是：" + evaluate);
    }

    public void line() {
        // 整个业务流水线
        int number = takeNumber();
        String evaluate = business();
        saveEvaluate(number, evaluate);
    }
}
