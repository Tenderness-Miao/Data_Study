package Day16;

import java.util.ArrayList;
import java.util.List;

public class Test08 {
    private List<String> values = new ArrayList<>();

    void add(String value) {
        values.add(value);
    }

    void remove(String value) {
        values.remove(value);
    }
}

class Test {
    public static void main(String[] args) {
        Test08 list = new Test08();
        list.add("a");
        list.remove("b");
    }
}
