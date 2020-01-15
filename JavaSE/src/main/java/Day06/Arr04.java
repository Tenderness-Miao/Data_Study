package Day06;

import java.util.Arrays;

/**
 * @program: Data_Study
 * @description: 复制一个数组
 * @author: HaoMiao
 * @create: 2019-10-27 12:00
 **/
public class Arr04 {
    public static void main(String[] args) {
        // 如何复制一个数组
        int[] arr1 = {111, 222, 333};
        int[] arr2 = new int[3];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        // 改变arr1数组数据
        arr1[1] = 4444;
        for (int item : arr2) {
            System.out.println(item + "\t");
        }
        System.out.println("-----------------------");

        // 直接复制数组，第一个参数要复制的数组名，第二个参数是新数组的长度
        int[] arr3 = Arrays.copyOf(arr1, 3);
        arr1[1] = 5555;
        for (int item : arr3) {
            System.out.println(item + "\t");
        }
    }
}
