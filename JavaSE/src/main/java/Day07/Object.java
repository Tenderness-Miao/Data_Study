package Day07;

import java.awt.*;

/**
 * @program: Data_Study
 * @description: 对象和类
 * @author: HaoMiao
 * @create: 2019-11-03 22:54
 **/
public class Object {
    public static void main(String[] args) {
        // p 和 p1是相互独立的，是同一个类创建出来的俩个对象
        Point p = new Point();
        Point p1 = new Point();
        p.y = 10;
        p1.y = 11;
        System.out.println(p.y + "," + p1.y);
    }
}
