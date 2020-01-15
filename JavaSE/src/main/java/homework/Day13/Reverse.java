package homework.Day13;

/**
 * @program: Data_Study
 * @description: 字符串翻转
 * @author: HaoMiao
 * @create: 2019-11-16 20:14
 **/
public class Reverse {
    private static String toReverse(String s) {

        char[] chars = s.toCharArray();
        int len = chars.length;
        char[] chars1 = new char[len];
        for (int i = 0; i < len; i++) {
            chars1[i] = chars[len - i - 1];
        }
        return new String(chars1);
    }

    public static void main(String[] args) {
        System.out.println(toReverse("asdfg"));
    }
}
