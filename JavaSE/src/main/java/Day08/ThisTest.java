package Day08;

/**
 * @program: Data_Study
 * @description:
 * @author: HaoMiao
 * @create: 2019-11-30 15:07
 **/
public class ThisTest {
    /**
     * 1.每个实例方法，构造器，都含有一个隐式参数this，
     * 2.在构造器当中this代表当前被创建的对象
     * 3.在实例化方法中this代表调用此方法的对象
     */
    private String name;
    int age;
    String color;

    // 每一个构造器（实例方法中也有）当中都有一个隐式参数this
    public ThisTest() {

    }

    // 在构造器当中this代表当前被创建的对象
    public ThisTest(String n) {
        this.name = n;
    }

    public ThisTest(String name, int age) {
        // 调用上面的构造器
        this(name);
        this.age = age;
    }

    public ThisTest(String n, int age, String color) {
        this.name = n;
        this.age = age;
        this.color = color;
    }

    // 在实例方法中，this代表调用方法的对象

    public void say() {
        System.out.println("我叫" + this.name);
    }
}

class Test {
    public static void main(String[] args) {
        ThisTest t = new ThisTest();
        ThisTest t2 = new ThisTest("猫", 3, "白色");
        t2.say();
        t.say();
    }
}
