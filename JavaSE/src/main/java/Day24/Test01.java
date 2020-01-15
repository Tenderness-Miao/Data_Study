package Day24;

import java.sql.*;

public class Test01 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String url = "jdbc:mysql://localhost:3306/data_study?useSSL=false&serverTimezone=Asia/Shanghai";
        String userName = "root";
        String passWord = "root";
        Connection con = null;
        PreparedStatement sta = null;
        try {
            con = DriverManager.getConnection(url, userName, passWord);
            sta = con.prepareStatement("insert into score(id,stu_id,c_name,grade) values (?,?,?,?)");
            sta.setInt(1, 13);
            sta.setInt(2, 902);
            sta.setString(3, "中文系");
            sta.setInt(4, 80);
            sta.execute();
            sta.setInt(1, 14);
            sta.setInt(2, 903);
            sta.setString(3, "中文系");
            sta.setInt(4, 88);
            sta.execute();
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
