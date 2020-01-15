package Day09;

/**
 * 多态分为编译时多态和运行时多态，其中编译时多态也叫静态多态
 * 运行时的多态为动态多态，通过动态绑定来实现（常说的多态）
 * - 静态多态：其实就是方法的重载，更具参数列表的不同在区分不同的参数（没有继承）
 * - 动态多态：所谓动态多态就是指引用在不同情况下所表现出来的实际对象
 * 多态的前提是有继承和方法重写
 */

/**
 * final修饰符
 * 被final修饰符修饰的类不能被继承
 * 被final修饰符修饰的方法不能被重写
 * 被final修饰符修饰的参数不能被修改
 */


public class Test {
    public static void main(String[] args) {
        // 多态的前提是继承和方法的重写
        // 父类型的变量可以引用子类型的对象，还是一个子类型的对象
        Aninmal2 a2 = new cat2();
        Aninmal2[] aninmal2s = {new cat2(), new dog2()};
        for (int i = 0; i < 2; i++) {
            // 调用的是实际引用的对象的方法
            aninmal2s[i].voice();
        }
        // a2.voice();

        // 打的可以接收小的，但小的不能接收大的
        // Cat2 c2 = new Aninmal2();

        // a2类型是Animal2类型，他只能识别Animal2类里的方法
        // a2.jump();

        cat2 c2 = (cat2) a2;
        c2.voice();
        c2.jump();
        System.out.println("---------------------");

        Aninmal2 a3 = new Aninmal2();
        // 小转大
        // 运行时异常
//        cat2 c3 = (cat2) a3;
//        c3.jump();
    }
}

class Aninmal2 {
    public void voice() {
        System.out.println("发出声音");
    }

//    public final int num() {
//        return 1;
//    }


    public final int num(final int a) {
        return a;
    }
}

class cat2 extends Aninmal2 {
    @Override
    public void voice() {
        System.out.println("小猫喵喵叫");
    }

    public void jump() {
        System.out.println("小猫跳得高");
    }
}

class dog2 extends Aninmal2 {
    @Override
    public void voice() {
        System.out.println("小狗汪汪叫");
    }
}