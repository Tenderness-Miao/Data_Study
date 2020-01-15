package homework.Day10;

/**
 * @program: Data_Study
 * @description: Day10 Shirt类，继承Frock类
 * @author: HaoMiao
 * @create: 2019-11-03 22:33
 **/
public class Shirt extends Frock {
    @Override
    public String clacArea(double size) {
        return getClass().getName() + "尺寸为：" + size * 1.3;
    }
}
