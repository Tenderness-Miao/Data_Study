package homework.Day16;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.intValue() - o1.intValue();
            }
        });
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第" + (i + 1) + "个数:");
            set.add(sc.nextInt());
        }

        for (Integer s : set) {
            System.out.print(s + "\t");
        }

    }
}
