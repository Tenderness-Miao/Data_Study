package Day18;

import java.io.*;

public class Test05 {
    /**
     * 拷贝文件
     * 先读取
     * 再写入
     * 单字符拷贝
     */
    public static void main(String[] args) {
        File file = new File("E:/test/test.txt");
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(file);
            fw = new FileWriter("E:/test/testcopy.txt");
            int c = 0;
            while (-1 != (c = fr.read())) {
                fw.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
