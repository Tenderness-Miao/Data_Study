package Day14;

public class Test03 {
    public static void main(String[] args) {
        /**
         * 在catch块中，子类异常应该在父类异常之前
         */
        try {
            AmountAdder.addMounts(new Amount("人民币", 1000), new Amount("dollar", 2));
        } catch (CurrencyNotMatchException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
