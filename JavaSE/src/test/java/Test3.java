import java.io.*;

public class Test3 {
    public static void main(String[] args) throws IOException {
//        File file = new File("E:\\WorkPlace\\test\\itstar.txt");
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
//
//        bufferedWriter.write("BigDATA is Good");
//        bufferedWriter.flush();
//        bufferedWriter.close();

        Integer var1 = new Integer(1);
        Integer var2 = var1;
        some(var2);
        System.out.println(var1.intValue());
        System.out.println(var1==var2);
    }
    public static void some(Integer integer){
        integer = new Integer(2);
    }
}
