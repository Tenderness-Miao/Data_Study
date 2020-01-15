package Day19;

import java.io.*;
import java.nio.charset.Charset;

public class Test04 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:/test/test01.java");
        InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
        BufferedReader br = new BufferedReader(isr);

        int b = 0;
        while (-1 != (b = br.read())) {
            System.out.println((char) b);
        }
        br.close();
    }
}
