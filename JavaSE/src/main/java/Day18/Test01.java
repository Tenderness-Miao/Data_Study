package Day18;

import java.io.File;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException {
        /**
         * 绝对路径，相对路径，dir代表一个目录
         */
        File dir = new File("E:/test");
        // 创建一个File对象file，代表文件
        File file = new File("E:/test/test1.txt");
        // 检测文件是否存在
        System.out.println(file.exists());
        // 没有的话，创建，然后返回true，没有创建返回false
        System.out.println(file.createNewFile());
        // 获取文件或者目录的名称
        System.out.println(file.getName());
        System.out.println(dir.getName());

        // 获取文件的全路径（绝对路径）
        System.out.println(file.getAbsolutePath());

        // 获取父目录的路径
        System.out.println(file.getParent());

        // 获取文件的大小
        System.out.println(file.length());

        // 判断是否为文件
        System.out.println(file.isFile());
        System.out.println(dir.isFile());

        // 是否为目录
        System.out.println(dir.isDirectory());

        // 判断文件是否可读
        System.out.println(file.canRead());

        // 判断文件是否可写
        System.out.println(file.canWrite());

        // 判断文件是否为隐藏文件
        System.out.println(file.isHidden());

        // 修改文件名
        File file1 = new File("E:/test/test01");
        file.renameTo(file1);

        // 删除文件
        System.out.println(file.delete());
    }
}
