package Day06;

/**
 * @program: Data_Study
 * @description: 基本数据类型和引用数据类型的区别
 * @author: HaoMiao
 * @create: 2019-10-27 11:52
 **/
public class Arr03 {
    public static void main(String[] args) {
        int a = 9;
        // 吧a的值赋值给b（a的值拷贝到b）
        int b = a;
        System.out.println(b);


        int[] arr1 = {111, 222, 333, 444};
        int[] arr2 = new int[4];
        // 把arr1的地址值赋给arr2
        arr2 = arr1;
        for (int item : arr2) {
            System.out.println(item);
        }
        System.out.println("arr1:------------------------");

        arr1[1] = 1111;
        for (int item : arr1) {
            System.out.println(item);
        }

        System.out.println("arr2:------------------------");

        for (int item : arr2) {
            System.out.println(item);
        }

        System.out.println("-----------基本数据类型-----------");
        // 基本数据类型传参累死于拷贝

        System.out.println("-----------引用数据类型-----------");
        // 通过地址值
        // 将实际参数a的值（数组地址值）拷贝给其他形式变量（参数）然后引用的是同一个数组
        int[] m = {111, 222, 000};
        // m是数组{111,222,000}的地址值，传递到方法f里面
        f(m);
    }

    public static void f(int[] n) {
        // 吧数组｛111，222，000｝的地址的地址拷贝给n
        for (int item : n) {
            System.out.println(item);
        }
    }
}
