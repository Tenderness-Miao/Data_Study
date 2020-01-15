package homework.Day14;

/**
 * @program: Data_Study
 * @description: Day14作业
 * @author: HaoMiao
 * @create: 2019-11-17 17:18
 **/
public class TestException {
    public static void test(String a, String b) throws Exception {
        try {
            int d1 = Integer.parseInt(a);
            int d2 = Integer.parseInt(b);
            System.out.println(d2 / d1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            test("a", "0");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
