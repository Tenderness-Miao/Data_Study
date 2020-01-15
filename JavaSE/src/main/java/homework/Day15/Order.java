package homework.Day15;

import java.util.*;

/**
 * @program: Data_Study
 * @description: 排序
 * @author: HaoMiao
 * @create: 2019-11-17 17:51
 **/
public class Order {
    public static void main(String[] args) {
        List<Integer> list =new LinkedList<>();
        System.out.println("请输入10个待排序的整数：");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }
        list.sort(Comparator.reverseOrder());
        System.out.println(list.toString());
    }
}
