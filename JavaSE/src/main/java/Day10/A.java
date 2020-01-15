package Day10;

/**
 * 成员内部类前面可以加四种访问修饰符
 * private：仅内部
 * protected：同包下或者继承类也可以访问
 * default：同包下访问
 * public：所有类
 */
public class A {
    public static void main(String[] args) {
        B b = new B();
        b.eat();

        // 创建内部类对象
        B.C c = b.new C();
        c.speak();

        B.C classC = b.getClassC();
        classC.speak();

        // 成员内部类对象的创建 外部类.内部类 类名 = 外部类.new 内部类()
        // 静态内部类对象的创建 外部类.内部类 类名 = new 外部类.内部类()
    }
}

/**
 * 成员内部类：
 * 定义在另一个类中
 * 成员内部类无条件的访问外部类的属性和方法，
 * 但是外部类想要访问内部类的属性和方法
 * 就必须创建内部类的对象，然后通过对象访问内部类的属性和方法
 * <p>
 * 外部类.this.属性/方法
 */

class B {
    int a;
    String s;

    void eat() {
        C c = new C();
        System.out.println(c.t);
        System.out.println("吃东西");
    }

    public C getClassC() {
        return new C();
    }

    class C {
        String t = "我是****";

        void speak() {
            eat();
            System.out.println(a);
            System.out.println("说话");
        }
    }
}

/**
 * 如果我们成员内部类属性或者方法重名了
 * 那么外部类的属性在内部类就隐藏了
 * 这时候需要使用外部类.this.属性/方法
 */

class D {
    String name = "外部类";

    void run() {
        System.out.println("外部类在运行");
    }

    // 使用内部类的属性和方法，需要创建内部类对象，使用对象去调用
    void say2() {
        E e = new E();
        System.out.println(e.value + e.name);
        e.say();
    }


    class E {
        String value = "EEE";
        String name = "内部类";

        void say() {
            System.out.println(D.this.name);
            System.out.println(name);
            run();
        }
    }
}
