package Day16;

import java.util.ArrayList;
import java.util.List;

public class MyList02<T extends Number> {
    private List<T> values = new ArrayList<>();
    void add(T value){
        values.add(value);
    }
    void remove(T value){
        values.remove(value);
    }
}

class TestML02{
    public static void main(String[] args) {
        MyList02<Integer> list = new MyList02<>();
        list.add(1);
        list.add(2);

    }
}
