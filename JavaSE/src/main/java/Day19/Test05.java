package Day19;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Test05 {
    public static void main(String[] args) {
        /**
         * File类
         * java.util.Properties类代表java的配置文件
         * java中以.properties结尾的文件都是配置文件
         * 将配置的参数，数据库连接信息放到配置文件中
         */
        Properties properties = new Properties();
        InputStream is = null;
        try {
            is = Test05.class.getResourceAsStream("/src/main/resources/test.properties");
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        properties.list(System.out);
        System.out.println("*************");
        String url = properties.getProperty("URL");
        String userName = properties.getProperty("UserName");
        String passWord = properties.getProperty("PassWord");
        System.out.println(url + "\t" + userName + "\t" + passWord);
    }
}
