package Day03;

/**
 * @program: Data_Study
 * @description: 转义符
 * @author: HaoMiao
 * @create: 2019-10-20 18:36
 **/
public class sym {
    // 转变其他字符的本来意思，赋予其他字符含义
    public static void main(String[] args) {
        char c = '\n';
        System.out.println('\n');
        System.out.println("*******" + '\n' + "*********");

        char b = '\t';
        System.out.println("*******" + '\t' + "*********");

        String s = "F:\\工作资料";
        // F:\工作资料

        System.out.println("\\");
        System.out.println("\"HelloWorld\"");
    }
}
