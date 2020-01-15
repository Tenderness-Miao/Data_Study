package Day02;

/**
 * @program: Data_Study
 * @description: 自增自减运算符
 * @author: HaoMiao
 * @create: 2019-10-20 13:07
 **/
public class Operation2 {
    public static void main(String[] args) {
        // 自增自减运算符

        // ++    --
        int a = 5;
        a++;
        System.out.println(a);

        a--;
        System.out.println(a);

        System.out.println("================");

        ++a;
        System.out.println(a);

        --a;
        System.out.println(a);

        int b = 3;
        int c = ++b;
        System.out.println(b);
        // 4
        System.out.println(c);
        // 4 先运算后赋值

        System.out.println("----------------");

        int d = 3;
        int e = d++;
        //（d++）
        System.out.println(d);
        // 4
        System.out.println(e);
        // 3 先赋值后运算

        // --也有类似操作
    }
}
