package Day14;

public class CurrencyNotMatchException extends Throwable {
    // 一般自定义异常都是运行检查异常吗，而不使用运行时异常
    public CurrencyNotMatchException(String message) {
        super(message);
    }
}
