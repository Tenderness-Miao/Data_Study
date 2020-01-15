package Day19;

import java.io.*;

public class Test03 {
    public static void main(String[] args) throws IOException {
        File file = new File("E:/test/test01.java");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        FileWriter fw = new FileWriter("E:/test/test01-1.java");
        BufferedWriter bw = new BufferedWriter(fw);
        int b = 0;
        while (-1 != (b = br.read())) {
            bw.write(b);
        }
        br.close();
        bw.close();
    }
}
