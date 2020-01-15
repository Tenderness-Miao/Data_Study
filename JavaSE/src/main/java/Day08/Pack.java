package Day08;

import Day07.Animal;

import java.util.Random;
import java.util.Scanner;
// jdk是一级一级的目录
// java.util java工具包

/**
 * java标准库中有很多类，这些类按照功能划分到不同的包下
 * java.util（java里面的工具包---包含工具类）
 * java.lang包（java最基础的类）
 * 类似于文件夹
 */

public class Pack {
    public static void main(String[] args) {
        // 导入自己写的包中的类
        // Animal animal = new Animal();

        // 为了避免类名的冲突，就将类分包
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        // int a = 10;
        int i = scanner.nextInt();
        System.out.println(i);
        System.out.println(s);

        // 产生一个随机数

        Random random = new Random();

        for (int j = 0; j < 100; j++) {
            // 0<=i<=1000
            int i1 = random.nextInt(1000);
            System.out.println(i1);
        }
    }
}
