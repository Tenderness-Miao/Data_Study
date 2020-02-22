package WebParser;

import java.util.ArrayList;
import java.util.Arrays;

public class Algorithm {
    public static void main(String[] args) {
        int[] arr ={0,0,1,1,2,2,3,3};
        ArrayList<Integer> integers = new ArrayList<>();
        for (int value : arr) {
            if (!integers.contains(value)) {
                integers.add(value);
            }
        }
        int[] arrOut = new int[integers.size()];
        for (int i = 0; i < integers.size(); i++) {
            if (integers.iterator().hasNext()){
                arrOut[i]=integers.get(i);
            }
        }
        System.out.println(Arrays.toString(arrOut));
    }
}
