package Day06;

/**
 * @program: Data_Study
 * @description: 数组的遍历
 * @author: HaoMiao
 * @create: 2019-10-27 00:05
 **/
public class Arr02 {
    public static void main(String[] args) {
        int[] ints = new int[2];
        if (ints[1] == ints[0]) {
            System.out.println("两数相等");
        } else if (ints[1] > ints[0]) {
            System.out.println("第二个值大于第一个值");
        } else {
            System.out.println("第一个值大于第二个值");
        }

        int n = 10;
        int[] ints1 = new int[n];

        int[] arr = {11, 15, 723, 6734, 3246, 3245, 32, 45, 4325, 1290};

        // for循环遍历
        System.out.println("普通for遍历：");
        for (int i = 0; i <= 9; i++) {
            System.out.println(arr[i] + "\t");
        }

        System.out.println();

        // 增强for循环遍历
        System.out.println("增强for遍历：");
        for (int item : arr) {
            System.out.println(item + "\t");
        }

        System.out.println("---------------------------");

        // for循环赋值
        int[] ints2 = new int[10];
        for (int i = 0; i <= 9; i++) {
            ints2[i] = (i + 10);
        }

        // 更改数组内的值，直接用新的值覆盖就的值就可以了
        for (int i = 0; i <= 9; i++) {
            ints2[i] = (i + 20);
        }

        // 增强for不便于修改值
        for (int item : ints2) {
            System.out.println(item + "\t");
        }
    }
}
