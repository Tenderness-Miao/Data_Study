package Day12;

public class Test3 {
    public static void f1(Integer i) {
        System.out.println("包装类型" + i);
    }

    public static void f2(int i) {
        System.out.println("基本数据类型" + i);
    }

    public static void main(String[] args) {
        // 自动装箱，调用类方法Integer.valueOf(int)
        Integer i1 = 1;
        System.out.println(i1);

        // 自动拆箱，调用实例方法intValue()
        int i2 = i1;
        System.out.println(i2);
        System.out.println(i1 == i2);// true，自动拆箱

        Integer ten = new Integer(10);
        ten++;
        System.out.println(ten);// 自动装箱

        f1(1);
        f2(ten);

        System.out.println("----------------");

        // 包装类的缓存
        Integer a = new Integer(10);
        Integer b = new Integer(10);
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println("---------------");

        Integer a1 = 128;
        Integer b1 = 128;
        System.out.println(a1 == b1);
        System.out.println(a1.equals(b1));
    }
}
