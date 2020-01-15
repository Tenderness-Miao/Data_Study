package homework.Day24;

import java.sql.*;
import java.util.Map;
import java.util.TreeMap;

public class DbUtils {
    private static Map connection() {
        TreeMap<String, Object> map = new TreeMap<>();
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
            sta = con.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        map.put("connection", con);
        map.put("statement", sta);
        return map;
    }

    private static void closeStat(Map map) {
        Connection con = (Connection) map.get("connection");
        Statement sta = (Statement) map.get("statement");
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

    public static boolean createTable(String sql) {
        boolean flag = false;
        Map map = connection();
        Statement sta = (Statement) map.get("statement");
        try {
            sta.execute(sql);
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStat(map);
            return flag;
        }
    }

    public static boolean insertData(String sql) {
        boolean flag = false;
        Map map = connection();
        Statement sta = (Statement) map.get("statement");
        try {
            sta.execute(sql);
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStat(map);
            return flag;
        }
    }

    public static boolean updateData(String sql) {
        boolean flag = false;
        Map map = connection();
        Statement sta = (Statement) map.get("statement");
        try {
            sta.executeUpdate(sql);
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStat(map);
            return flag;
        }
    }

    public static boolean queryData(String sql) {
        boolean flag = false;
        Map map = connection();
        Statement sta = (Statement) map.get("statement");
        try {
            ResultSet resultSet = sta.executeQuery(sql);
            while (resultSet.next()) {
                int num = resultSet.getInt(1);
                String name = resultSet.getString(2);
                System.out.println(num + "\t" + name);
            }
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStat(map);
            return flag;
        }
    }
    public static boolean deleteData(String sql){
        boolean flag = false;
        Map map = connection();
        Statement sta = (Statement) map.get("statement");
        try {
            sta.execute(sql);
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStat(map);
            return flag;
        }
    }
}
