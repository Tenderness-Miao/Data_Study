package Day24;

import java.sql.*;

public class Test03 {
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
        Statement sta = null;
        try {
            con = DriverManager.getConnection(url, userName, passWord);
            con.setAutoCommit(false);
            sta = con.createStatement();
            int i1 = sta.executeUpdate("update score set grade=grade+1 where grade=96");
            System.out.println(i1);
            con.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            try{
                con.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
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
