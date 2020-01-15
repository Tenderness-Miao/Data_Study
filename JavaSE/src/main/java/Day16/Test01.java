package Day16;

import java.util.LinkedList;

public class Test01 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        System.out.println(list.size());
        System.out.println(list.contains("a"));
    }
}
