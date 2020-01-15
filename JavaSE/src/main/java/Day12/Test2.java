package Day12;

/**
 * 包装类
 * 基本数据类型：byte short int long char float double boolean
 * 包装类：将基本数据类型的值包装成一个对象
 * 包装类：Byte Short Integer Long Character Float Double Boolean
 * 使用包装类：
 * 基本类型不允许出现null值，但包装类可以
 * 集合中不允许使用基本数据类型，包装类可以
 * 类型转换
 * 包装类有final修饰，并且包装类的对象不可改变，因为没有修饰对象内部属性的方法
 */
public class Test2 {
    public static void main(String[] args) {
        // 将基本数据类型转换为一个引用类型
        Integer int1 = new Integer(55);
        Integer int2 = new Integer("55");
        System.out.println(int1);
        System.out.println(int2);

        Float float1 = new Float(55.0F);
        Float float2 = new Float("55.0F");
        System.out.println(float1);
        System.out.println(float2);

        Character c1 = new Character('C');
        System.out.println(c1);
        Integer i = null;
        System.out.println(i);

        // valueOf方法，替代构造器，提供另一种方式来创建包装对象
        System.out.println();
        System.out.println(Integer.valueOf("7"));
//        System.out.println(Integer.valueOf("null"));
        System.out.println(Integer.valueOf("1111", 2));

        // xxxValue方法，将包装类型转为基本类型
        // 获取包装类对象
        Integer i1 = Integer.valueOf(9);
        int i2 = i1.intValue();
        float f1 = i1.floatValue();
        System.out.println(i2);
        System.out.println(f1);

        // parseXxx方法，类似于valueOf方法，但是此地方返回基本数据类型
        int i3 = Integer.parseInt("10");
//        int i4 = Integer.parseInt("null");
        System.out.println(i3);
        int i4 = Integer.parseInt("111", 2);
        System.out.println(i4);
        System.out.println("-------------------------");

        // 静态的toString方法可以将基本的数据类型转化为字符串
        String s1 = Integer.toString(10);
        System.out.println(s1);

        String s = Integer.toString(11, 2);
        System.out.println(s);
    }

}
