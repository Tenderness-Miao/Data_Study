package Day02;

/**
 * @program: Data_Study
 * @description: 位运算符
 * @author: HaoMiao
 * @create: 2019-10-20 16:05
 **/
public class Operation6 {
    /**
     * 1101010101010101
     * 位与       &   两个数都是1，结果就是1，否则为0
     * 位或       |   两个数只要有一个为1，就为1
     * 位异或     ^   异1 相同为0
     * 移位运算     即取反 ~ ，左移 <<, 右移 >>, 无符号右移 >>>
     */
    public static void main(String[] args) {
        System.out.println("2 & 3" + "---->" + (2 & 3));
        System.out.println("2 | 3" + "---->" + (2 | 3));
        System.out.println("2 ^ 3" + "---->" + (2 ^ 3));

        System.out.println("-----------------------");

        // 取反：0变1，1变0
        // 二进制数在计算机中是以补码形式存在
        // 正数的原码反码补码都是一样的
        // 负数的补码是该负数的反码+1
        System.out.println(Integer.toBinaryString(-2));
        System.out.println(Integer.toBinaryString(-3));
        System.out.println(~-3);
        // 符号位取反

        // 移位  用0填补空位

        // -2补码 1111 1111 1111 1111 1111 1111 1111 1110
        // 左移:  1111 1111 1111 1111 1111 1111 1111 1100
        System.out.println(Integer.toBinaryString((-2 << 1)));
        // 符号位不参与
        System.out.println(-2 << 1);
        // 没有无符号左移，相当于乘2

        //右移 >>     相当于除2
        //2的补码:0000 0000 0000 0000 0000 0000 0000 0010
        //右移一位:0000 0000 0000 0000 0000 0000 0000 0001
        System.out.println(2 >> 1);
        System.out.println(2 << 1);
        System.out.println("-------------------------------");

        //-2补码 1111 1111 1111 1111 1111 1111 1111 1110
        //右移一位:1111 1111 1111 1111 1111 1111 1111 1111
        System.out.println(-2 >> 1);
        //-1
        System.out.println("**********************************");

        // 无符号右移 >>>（没有无符号左移）\
        System.out.println(2 >> 1);
        System.out.println(2 >>> 1);
        //正数无符号右移和有符号右移一样
        System.out.println("-------------------");


        System.out.println(-2 >> 1);
        System.out.println(-2 >>> 1);
        System.out.println("***********************************");
        // -2的补码:        11111111111111111111111111111110
        // 2147483647的补码:01111111111111111111111111111111
        System.out.println(Integer.toBinaryString(-2));
        System.out.println(Integer.toBinaryString(2147483647));
    }
}
