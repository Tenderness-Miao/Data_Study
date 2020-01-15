package Day18;

import java.io.*;

public class Test06 {
    public static void main(String[] args) throws IOException {
        File file = new File("E:/test/Test01.java");

        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(file);
            fw = new FileWriter("E:/test/Test01Copy.java");
            char[] chars = new char[256];
            int len = 0;
            while (-1 != (len = fr.read(chars))) {
                fw.write(chars, 0, len);
                fw.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException o) {
                    o.printStackTrace();
                }
            }
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
