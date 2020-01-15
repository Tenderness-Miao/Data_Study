package Day07;

/**
 * @program: Data_Study
 * @description: 成员变量与成员方法
 * @author: HaoMiao
 * @create: 2019-11-03 23:11
 **/
public class Var {
    public static void main(String[] args) {
        /**
         * 在类中定义的变量叫做成员变量，成员变量分为两种：
         * 1.静态成员变量（static修饰）：类变量
         * 2.非静态成员变量（不带static修饰）：实例变量
         * 静态成员变量属于类，通过类名直接调用，每个类在jvm中只有一个，因此静态成员变量只有一份
         * 非静态的成员变量，属于对象，通过对象调用，一个类可以创建多个对象，每个对象都有自己的实例变量，与其他的的对象相独立
         *
         * 类变量随类的加载而加载，实例变量随对象的创建而创建
         * 类变量通过类名调用，实例对象通过对象调用
         */

        /**
         * 成员方法分为两种：
         * 1.静态成员方法（类方法）与类同时加载，通过类名调用
         * 2.非静态成员方法（实例方法），通过对象调用
         */
        // 非静态方法调用
//        person person1=new person();
//        System.out.println(person1.play());

        // 静态方法调用
        person.play();
    }
}

class person {
    String name;
    int age;
    String gender;

    // 非静态的方法
//    public String play(){
//        return "打篮球";
//    }
    // 静态的方法
    public static String play() {
        return "打篮球";
    }
}
