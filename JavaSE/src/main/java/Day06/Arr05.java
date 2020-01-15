package Day06;

/**
 * @program: Data_Study
 * @description: 二维数组
 * @author: HaoMiao
 * @create: 2019-10-27 12:04
 **/
public class Arr05 {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {1, 2}};
        int[][] arr2 = new int[6][];

        // 打印的是arr1的地址值（二维数组的地址值）
        System.out.println(arr1);
        // 打印的是arr1里面第二个数组的地址
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("第" + (i + 1) + "个数组为:");
            for (int item : arr1[i]) {
                System.out.print(item + ",");
            }
            System.out.println();
        }

        System.out.println("----------------------------");

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("第" + (i + 1) + "个数组为:");
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + ",");
            }
            System.out.println();
        }
    }
}
