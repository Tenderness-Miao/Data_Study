package Day19;

import java.io.*;

public class Test02 {
    public static void main(String[] args) {
        File file = new File("E:/test/课时1 深度学习框架简介.mp4");
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(file);
            fos = new FileOutputStream("E:/test/课时1 深度学习框架简介1.mp4");
            int len = 0;
            byte[] bs = new byte[256];
            while (-1 != (len = fis.read(bs))) {
                fos.write(bs, 0, len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
