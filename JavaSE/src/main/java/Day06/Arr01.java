package Day06;

/**
 * @program: Data_Study
 * @description: 初始化和访问数组
 * @author: HaoMiao
 * @create: 2019-10-26 23:56
 **/
public class Arr01 {
    public static void main(String[] args) {
        int arr[] = {10, 11, 19, 80, 10};
        int a = arr[2];
        // 首元素地址值+索引=对应元素的地址值
        // arr[1];
        System.out.println(a);

        int[] ints = new int[7];
        ints[0] = 10;
        ints[1] = 11;
        ints[2] = 12;
        // ......
        ints[6] = 16;
        System.out.println(ints[1]);
        // 打印的是第二个元素的值
        System.out.println(ints[6]);
        System.out.println(ints);
        // 打印的是数组的地址值

        // 基本数据类型放进创建数组
        byte byteArr[] = {1, 2, 3};
        byte[] bytes = new byte[10];
        short[] shorts = new short[10];
        long[] longs = new long[10];
        boolean[] booleans = new boolean[10];

        // 引用类型数据也可以放进数组（数组放进数组里面就形成了二维数组）
        String[] strings = new String[10];

        System.out.println(booleans[1]);
        // 打印数组内的元素个数
        System.out.println(strings.length);
        // 获取数组的最后一个元素
        System.out.println(strings[strings.length - 1]);
    }
}
