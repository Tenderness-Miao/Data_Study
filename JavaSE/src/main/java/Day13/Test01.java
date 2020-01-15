package Day13;

/**
 * StringBuilder和StringBuffer
 * String的值是不可变的，这就导致每次对string 的操作都会生成新的String对象，这样不仅效率低下，而且大量浪费有限的内存空间
 * 和String类不同的是，StringBuffer和StringBuilder类的对象能够被多次的修改，并且不产生新的未使用对象
 */
public class Test01 {
    public static void main(String[] args) {
        // String的值是不能改变的
        String s = "hello";
        String s1 = new String("world");
        // 每次对String操作都会产生新的String对象
        String s2 = s + s1;

        String str = "hello world";

        // 返回一个字符数组
        char[] chars = str.toCharArray();

        // 返回对应索引的字符
        char c = str.charAt(2);
        // 将所给的字符串拼接到尾部
        System.out.println(str.concat("!!"));
        // 判断是否含有指定字符 true
        System.out.println(str.contains("ll"));
        // 判断是否以给定字符串开头 false
        System.out.println(str.startsWith("ello"));
        // 从给定索引位置开始判断 true
        System.out.println(str.startsWith("ello", 1));
        // 判断是否以给定字符结尾
        System.out.println(str.endsWith("ld"));

        // 字符在这个字符串当中第一次出现的索引位置
        System.out.println(str.indexOf('o'));
        // 给定字符串在此字符串中的位置（给定字符串第一个字符的索引）
        System.out.println(str.indexOf("ello"));
        // 从给定索引位置开始检索
        System.out.println(str.indexOf('o', 5));
        // 返回指定字符（字符串）最后一次出现的索引位置（第一个字符）
        System.out.println(str.lastIndexOf('o'));

        // 判断俩个字符是否相等，考虑大小写
        System.out.println("abc".equals("ABC"));
        // 判断俩个字符是否相等，不考虑大小写
        System.out.println("abc".equalsIgnoreCase("ABC"));

        /**
         * StringBuffer和StringBuilder可以多次修改而不产生新的对象
         * 频繁使用字符串拼接的时候，用String就会创建出大量对象
         * 这时候使用StringBuffer或者StringBuilder
         */

        StringBuffer sBuffer = new StringBuffer();
        StringBuilder sBuilder = new StringBuilder();

        // append方法将参数字符（字符串）拼接到内部的字符数组中，并返回this，因此可以进行后续的拼接
        sBuffer.append('a');
        System.out.println(sBuffer);
        // 追加
        System.out.println(sBuffer.append("adfad"));
        // 插入
        System.out.println(sBuffer.insert(2, "f"));

        sBuilder.append('a');
        System.out.println(sBuilder);
        System.out.println(sBuilder.append("dfa"));
        System.out.println(sBuilder.insert(2, "df"));
    }
}
