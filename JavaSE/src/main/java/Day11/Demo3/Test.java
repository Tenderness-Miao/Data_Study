package Day11.Demo3;

public class Test {
    /**
     * 模版模式就是首先预定一个模版
     * 这个模版中含有一些通用的功能
     * 当切换实现类的时候，实现特定的功能（业务）
     */
    public static void main(String[] args) {
        NewCard newCard = new NewCard();
        newCard.line();

        Transform transform = new Transform();
        transform.line();
    }
}
