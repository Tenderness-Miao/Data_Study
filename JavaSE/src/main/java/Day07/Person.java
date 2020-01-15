package Day07;

/**
 * @program: Data_Study
 * @description: 使用自定义类
 * @author: HaoMiao
 * @create: 2019-11-03 22:57
 **/
public class Person {
    /**
     * 取名见名知意
     * 1.对象是类的实例，类是创建对象的模版（蓝图）
     * 2.一个类就是一个模板，Person就是一个模板，可以创建多个对象，类决定了对象所能有的状态和行为。
     * 3.通过Person类定义就知道Person创建的对象，拥有name，age，gender三个属性，还有speak方法
     * 4.一个对象就是类的实例，用new Person()创建对象
     * 5.对象的状态（属性和方法），可以通过调用对象去修改对象的状态
     */

    // 类的属性（状态）
    String name = "小红";
    int age = 18;
    String gender = "女";

    // 类的方法
    public String speak() {
        return "我会说中文";
    }
}

class UseClass {
    public static void main(String[] args) {
        // 创建对象, w:对象
        Person w = new Person();
        // 调用对象的方法
        System.out.println(w.speak());
        // 调用对象的属性
        System.out.println(w.age);
        System.out.println("------------------");

        Person w1 = new Person();
        w1.age = 20;
        w1.name = "小明";
        w1.gender = "男";
        System.out.println(w1.gender + "," + w1.name);
        System.out.println(w1.speak());
    }
}
