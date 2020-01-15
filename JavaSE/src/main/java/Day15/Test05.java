package Day15;

import java.util.ArrayList;
import java.util.Collections;

public class Test05 {
    public static void main(String[] args) {
        /**
         * list排序
         * Collection.sort()可以对List进行排序
         * 前提是List元素中实现了Compareable接口
         */
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        System.out.println(list);

        // 对集合进行排序，依赖元素实现Compareable接口
        // String实现了Compareable接口，按字典顺序排序
        Collections.sort(list);
        System.out.println(list);
    }
}
