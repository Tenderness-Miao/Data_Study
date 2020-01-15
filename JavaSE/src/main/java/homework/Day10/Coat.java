package homework.Day10;

/**
 * @program: Data_Study
 * @description: Day10 Coat类继承Frock类
 * @author: HaoMiao
 * @create: 2019-11-03 22:34
 **/
public class Coat extends Frock {
    @Override
    public String clacArea(double size) {
        return getClass().getName() + "尺寸为：" + size * 1.5;
    }
}
