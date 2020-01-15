package Day24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
    /**
     * jdbc是java api
     * 使用jdbc访问数据库，类似于sqlyog客户端
     * 1、连接数据库
     * 2、将更新语句发送到数据库
     * 3、获取数据库查询的结果
     * jdbc提供了一套标准接口，各个数据库厂商需要找接口标准实现这些接口
     * 这些实现类被称为jdbc-数据驱动
     * 访问数据库需要获取这些驱动
     */
    public static void main(String[] args) {
        /**
         * 1.加载驱动
         * Class.forname加载驱动类
         * 访问不同的数据库用不同的驱动类
         */
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        /**
         * 数据库的url用于配置参数：主机名，端口号，数据库名称，参数设置
         * 用户名
         * 密码
         */

        String url = "jdbc:mysql://localhost:3306/data_study?useSSL=false&serverTimezone=Asia/Shanghai";
        String userName = "root";
        String passWord = "root";
        Connection con = null;
        Statement sta = null;
        try {
            // 2.获取数据库连接对象
            con = DriverManager.getConnection(url, userName, passWord);
            // 3.创建Statement对象，用于执行sql语句
            sta = con.createStatement();
            int i = sta.executeUpdate("update score set grade=95 where grade=65");
            System.out.println(i);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (sta != null) {
                try {
                    sta.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
