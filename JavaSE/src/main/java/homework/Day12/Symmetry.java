package homework.Day12;

/**
 * @program: Data_Study
 * @description: 判断字符串是否对称
 * @author: HaoMiao
 * @create: 2019-11-16 19:39
 **/
public class Symmetry {
    public static String judgeSymmetry(String s) {
        boolean result = false;
        char[] s1 = s.toCharArray();
        int len = s1.length;
        for (int i = 0; i < len; i++) {
            if (s1[i] == s1[len - i - 1]) {
                if (i == len / 2) {
                    result = true;
                    break;
                }
            }
        }
        return s + (result ? " 字符串对称" : " 字符串不对称");
    }

    public static void main(String[] args) {
        System.out.println(judgeSymmetry("abcdefgfedcba"));
    }
}
