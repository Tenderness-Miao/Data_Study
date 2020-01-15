package Day13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test03 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        // 返回从1970年1月1日 00:00:00 到现在为止的毫秒数
        // 系统时间
        System.out.println(date);
        // 设置时间
        date.setTime(date.getTime() + 2 * 60 * 60 * 1000);
        System.out.println(date);
        date.setTime(date.getTime() - 2 * 60 * 60 * 1000);
        System.out.println(date);

        // 使用simpleDateFormat对日期进行格式化
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = simpleDateFormat.format(date);
        System.out.println(str);

        // 抛出异常交给jvm处理
        Date now = simpleDateFormat.parse(str);
        System.out.println(now);
    }
}
