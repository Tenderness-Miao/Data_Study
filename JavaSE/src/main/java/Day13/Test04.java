package Day13;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test04 {
    public static void main(String[] args) {
        /**
         * Calendar类可以操作增加减少 年 月 日
         * Calendar是一个抽象类，不能创建实例，可以使用静态方法getInstance获取实例
         */

        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());

        // 修改年 月 日
        c.add(Calendar.YEAR, 1);
        System.out.println(c.getTime());
        c.add(Calendar.MONTH, 1);
        System.out.println(c.getTime());
        c.add(Calendar.DATE, 1);
        System.out.println(c.getTime());

        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DATE));

        // 设置日期
        c.set(Calendar.YEAR, 2019);
        System.out.println(c.getTime());

        // 日期格式转换
        Date date = c.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = sdf.format(date);
        System.out.println(str);
    }
}
