package Day19;

import java.io.*;

public class Test01 {
    /**
     * 字节流每次读写一个字节，字符流每次读写一个字符
     * 字节流只能读写任何文件，但字符流每次读写文本文件
     * 字节流继承自InputStream，OutputStream
     * 字符流继承自Reader和Writer
     * 凡是带Stream都是字节流，其他的都是字符流
     */
    public static void main(String[] args) {
        // 单字节拷贝MP4格式文件
        File file = new File("E:/test/课时1 深度学习框架简介.mp4");
        // 创建字节输入流
        FileInputStream fis=null;
        // 创建字节输出流
        FileOutputStream fos=null;
        try{
            fis=new FileInputStream(file);
            fos=new FileOutputStream("E:/test/课时1 深度学习框架简介(副本).mp4");
            int b=0;
            while (-1!=(b=fis.read())){
                // 将字节输入到输出流
                fos.write(b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try{
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
