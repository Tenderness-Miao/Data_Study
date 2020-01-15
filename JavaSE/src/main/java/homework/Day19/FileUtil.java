package homework.Day19;

import java.io.*;
import java.util.Scanner;

public class FileUtil {
    private static boolean copy(String src, String dest) throws IOException {
        File fileSrc = new File(src);
        File fileDest = new File(dest);
        String choice;
        if (!fileSrc.exists()) {
            System.out.println("源文件不存在");
            return false;
        }
        if (fileDest.exists()) {
            System.out.println("目标文件存在");
            System.out.println("是否覆盖（覆盖或取消）：");
            Scanner sc = new Scanner(System.in);

            choice = sc.nextLine();
            switch (choice) {
                case "覆盖":
                    fileDest.delete();
                    copyFile(src, dest);
                    return true;
                case "取消":
                    return false;
                default:
                    System.out.println("请选择一个选项：");
                    copy(src, dest);
                    return false;
            }
        }
        copyFile(src, dest);
        return true;
    }

    public static void copyFile(String src, String dest) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(src);
            fos = new FileOutputStream(dest);
            int len;
            byte[] bytes = new byte[256];
            while (-1 != (len = fis.read(bytes))) {
                fos.write(bytes, 0, len);
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

    public static void cutFile(String src, String dest) throws IOException {
        Boolean flag = copy(src, dest);
        while (flag) {
            File file = new File(src);
            file.delete();
        }
    }
}
