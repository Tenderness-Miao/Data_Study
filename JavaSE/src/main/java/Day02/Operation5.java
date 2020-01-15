package Day02;

/**
 * @program: Data_Study
 * @description: 三元操作符
 * @author: HaoMiao
 * @create: 2019-10-20 15:47
 **/
public class Operation5 {
    public static void main(String[] args) {
        int a = 60;
        String s = a >= 50 ? "未及格" : "及格";
        System.out.println(s);
        int b = 59;
        System.out.println(b >= 60 ? "及格了" : "未及格");
    }
}
