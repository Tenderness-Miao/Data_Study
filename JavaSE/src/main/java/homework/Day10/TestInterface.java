package homework.Day10;

/**
 * @program: Data_Study
 * @description: Day10 接口测试类
 * @author: HaoMiao
 * @create: 2019-11-03 22:45
 **/
public class TestInterface extends Mouth implements useMouthEat, useMouthSpeak {
    @Override
    public String sing() {
        return getClass().getName() + ": sing a song";
    }

    @Override
    public String eat() {
        return getClass().getName() + ": 吃东西";
    }

    @Override
    public String speak() {
        return getClass().getName() + ": 说三国";
    }
}
