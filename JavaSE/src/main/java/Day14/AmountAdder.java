package Day14;

public class AmountAdder {
    public static Amount addMounts(Amount m1, Amount m2) throws CurrencyNotMatchException {
        /**
         * 在static块中，子类异常应该在父类异常之前
         */
        if (!m1.getCurrency().equals(m2.getCurrency())) {
            throw new CurrencyNotMatchException("货币类型不匹配");
        } else {
            return new Amount(m1.getCurrency(), m1.getAmount() + m2.getAmount());
        }

    }

    public static void main(String[] args) throws CurrencyNotMatchException {
        AmountAdder.addMounts(new Amount("人民币", 1000), new Amount("dollar", 2));
    }
}
