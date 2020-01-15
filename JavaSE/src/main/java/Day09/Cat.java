package Day09;

public class Cat extends Animal {
    public int height;
    public int age;

    public Cat() {
    }

    public Cat(int height, int age) {
        /**
         * 1.在子类的构造方法中直接通过super关键词，调用父类的构造方法，
         *      如果在父类有多个构造器，更加构造器参数列表来区分
         * 2.如果父类和子类有同名的成员变量，访问父类成员变量可以通过super调用。
         *
         * 3.也可以通过super调用父类的方法。
         */
        // 调用父类的无参构造。一定要放在第一行，默认就有，不用手写
        // super()

        this.height = height;
        this.age = age;
        // System.out.println("猫");
        // System.out.println(super.age);
        // 同包可以使用
        // System.out.println(super.color);
        // 默认的可以使用
        // System.out.println(super.gender);
        // System.out.println(this.age);
        // System.out.println(super.getName());
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Animal类：父类，基类，超类
     * Cat类：子类，派生类
     * <p>
     * 1.一个子类可以继承父类的所有public和protected成员（非静态成员--！静态成员不考虑继承问题！）
     * 2.如果子类和父类在同一个包下，他可以继承父类默认的访问权限成员。
     * 3.private成员不能被访问
     * <p>
     * <p>
     * 一个子类只能直接继承一个父类
     * 一个父类可以被多个子类继承
     * <p>
     * 继承可以存在多级继承
     * <p>
     * 1.子类重写的方法不能比父类拥有更小的权限
     * 2.子类只能重写它可见的方法。即标记了static和final的方法不能被重写
     * 3.在重写过程中可以使用super关键字调用其超类的方法
     */

    // 子类重写的方法不能比父类拥有更小的权限
//    @Override
//    private void voice(){
//        System.out.println("喵喵叫");
//    }
    // zi类只能重写它可见的方法
//    @Override
//    public static void anotherMethod(){
//
//    }

    @Override
    public void voice() {
        // 在重写过程中可以使用super关键字调用其超类的方法
        super.voice();
    }

    public static void main(String[] args) {
        Cat cat = new Cat(1, 2);
        System.out.println(cat.age);
        cat.voice();
//        cat.anotherMethod();
    }
}
