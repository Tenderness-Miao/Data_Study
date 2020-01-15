package Day18;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

public class Test03 {
    public static void main(String[] args) {
        // 过滤当前目录中的所有文件名以“新建文件夹”开头的文件 获取名称
        File dir = new File("E:/test");
        String[] names = dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.startsWith("新建文件夹");
            }
        });
        System.out.println(Arrays.toString(names));

        // 过滤当前目录中的所有文件名以“test”开头的文件 获取对象
        File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.startsWith("test");
            }
        });
        System.out.println(Arrays.toString(files));

        // 过滤文件大小低于20字节的文件
        File[] filesArr = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.length() <= 20;
            }
        });
        System.out.println(Arrays.toString(filesArr));
    }
}
