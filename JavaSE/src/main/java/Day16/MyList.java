package Day16;

import java.util.ArrayList;
import java.util.List;

public class MyList<Object> {
    private List<Object> values = new ArrayList<>();

    void add(Object value) {
        values.add(value);
    }

    void remove(Object value) {
        values.remove(value);
    }
}

class TestML {
    public static void main(String[] args) {
        MyList<Object> list = new MyList<>();
        list.add("a");
        list.remove("b");
        list.add(1);

        MyList<Object> list1 = new MyList<>();
        list1.add(1);
        list1.add(1);
        System.out.println(list1);
    }
}
