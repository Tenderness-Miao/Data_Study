package homework.Day24;

import static homework.Day24.DbUtils.*;

public class useJDBC {
    public static void main(String[] args) {
        System.out.println(createTable("create table homework(num int,name varchar(20))"));
        System.out.println(insertData("insert into homework values(2,'jdbc')"));
        System.out.println(updateData("update homework set num=1 where num=2"));
        System.out.println(queryData("select * from homework"));
        System.out.println(deleteData("delete from homework where num=2"));
    }
}
