package Day18;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test04 {
    /**
     * I: Input 输入流
     * O: Output 输出流
     */
    public static void main(String[] args) throws IOException {
        // 文件：写入目的地
        File file = new File("E:/test/test01.txt");
        // 创建流
        FileWriter fileWriter = new FileWriter(file);
        // 向流中写数据
        fileWriter.write("Data_安平：别吓唬老师哈 他就怕调研");
        // 刷新流缓存
        fileWriter.flush();
        // 关闭流
        fileWriter.close();

        // 创建输入流
        FileReader fileReader = new FileReader(file);
        char[] chars = new char[256];
        // read方法将流中的数据读到char数组中，返回读到的字节数
        int len = fileReader.read(chars);
        System.out.println(len);

        char[] arr = new char[len];
        System.arraycopy(chars, 0, arr, 0, len);
        // 关闭流
        fileReader.close();
        String s = new String(arr);
        System.out.println(s);
    }
}
