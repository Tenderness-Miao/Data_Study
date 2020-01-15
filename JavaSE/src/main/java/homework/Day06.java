package homework;

import java.util.Arrays;

/**
 * @program: Data_Study
 * @description: day06 作业
 * @author: HaoMiao
 * @create: 2019-10-27 12:26
 **/
public class Day06 {
    public static void main(String[] args) {
        int[] nums = {5, 10, 15};
        touchNewArr(nums);
        System.out.println("----------------------");
        int[] arr = {12, 23, 34, 34, 45, 43, 32, 21};
        calculate(arr);
        System.out.println("----------------------");
        System.out.println("20个月的兔子总数为：" + multiply(20));
    }

    private static void touchNewArr(int[] ints) {
        int[] newInts = new int[ints.length];
        for (int i = 0; i < ints.length; i++) {
            newInts[i] = 2 * ints[i];
            System.out.println("新数组第" + (i + 1) + "个元素值为：" + newInts[i]);
        }
    }

    private static void calculate(int[] ints) {
        int[] arr = Arrays.copyOf(ints, ints.length);
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        int min = arr[0];
        int sum = 0;

        for (int value : arr) {
            sum += value;
        }
        int avg = sum / arr.length;
        System.out.println("该数组的最大值为：" + max + "\t该数组的最小值为：" + min + "\t该数组的平均值为：" + avg);
    }

    private static int multiply(int month) {
        if (month == 1 || month == 2) {
            return 1;
        } else {
            return multiply(month - 1) + multiply(month - 2);
        }
    }
}
