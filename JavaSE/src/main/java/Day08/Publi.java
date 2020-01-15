package Day08;

public class Publi {
    /**
     * public 是访问权限修饰符
     * 修饰类的时候：
     * 指的是这个类是共有的（包括同一个包下边的类和不同包下的类）
     * 如果不写（default）那么只有在同一个包下可以互相访问
     * 修饰成员变量、成员方法
     * <p>
     * 成员变量和成员方法总共有四种访问权限：
     * 1、默认的   （default）（包访问权限）
     * 2、共有的   public
     * 3、私有的   private
     * 4、受保护的  protected
     * <p>
     * 不使用访问修饰符就是默认的权限
     * 使用public 修饰    可以被任意的类访问
     * 使用private 修饰   只能在声明的类中访问，保护了类的数据不被别人篡改
     * 使用protected 修饰 可以被其子类访问，被同一包下的无关类访问
     */

    String name;
    int age;
    private String color;

    // alt + ins 生成构造器的快捷键

    public Publi(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
}

class test {
    public static void main(String[] args) {
        Publi publi = new Publi("小猫", 2, "黑色");
        System.out.println(publi.name);
        // 被private修饰不能在其他类中被使用
        // System.out.println(publi.color);
    }
}
