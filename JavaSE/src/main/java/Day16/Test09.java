package Day16;

import java.util.List;

public class Test09 {
    // <X extends Number>方法泛型的声明
    public static <X extends Number> X f1(X number) {
        System.out.println(number);
        return number;
    }

    // <T>方法泛型的声明
    public static <T> T f2(T number) {
        System.out.println(number);
        return number;
    }

    // <E>方法泛型的声明
    public static <E> void f3(E numder) {
        System.out.println(numder);
    }

    public static void main(String[] args) {
        System.out.println(f1(1));
        System.out.println(f2("a"));
        f3(1);
    }

    public static void f4(List<? extends Number> list) {
        // 上界通配符
    }

    public static void f5(List<? super Integer> list) {
        // 下界通配符
    }

    public static void f6(List<?> list) {
        // 无界通配符
    }

    public static void f7(List<Object> list) {
        // <? super Integer>里面类型不匹配会插入null
    }
    /**
     * <T> java编译器会推断成具体的类型
     * <?> 会被推断成未知的类型
     * %：任意数量的字符
     * -：单个未知的字符
     */
}
