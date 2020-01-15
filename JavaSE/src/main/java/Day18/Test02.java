package Day18;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) throws IOException {
        File dir = new File("E:/test");
        // 虚拟的，并不存在的
        File file = new File(dir, "test01.txt");
        System.out.println(file.createNewFile());
        System.out.println(file.getAbsolutePath());

        // 列出目录下的所有文件和目录
        String[] names = dir.list();
        System.out.println(Arrays.toString(names));

        // 返回所有的文件对象
        File[] files = dir.listFiles();

        // directory目录
        File file1 = new File(dir, "testDeep1/test.txt");
        file1.createNewFile();
    }
}
