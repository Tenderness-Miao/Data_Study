package homework.Day18;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UseIO {
    public static void main(String[] args) throws IOException {
        File dir = new File("E:/test");
        dir.mkdir();

        File childDir = new File(dir, "abc");
        childDir.mkdir();

        File file = new File(childDir, "text.txt");
        file.createNewFile();
        FileWriter fw = new FileWriter(file);
        fw.write("Day18作业");
        fw.close();

        FileReader fr = new FileReader(file);
        char[] chars = new char[256];
        int len = fr.read(chars);
        for (int i = 0; i < len; i++) {
            System.out.print(chars[i]);
        }
    }
}
