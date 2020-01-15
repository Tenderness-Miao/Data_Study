package Day07;

/**
 * @program: Data_Study
 * @description: 构造器
 * @author: HaoMiao
 * @create: 2019-11-03 23:21
 **/
public class Animal {
    /**
     * 当使用new 操作符创建类的实例的时候，构造器会被调用，没有构造器不能创建对象，编译器默认提供一个无参构造器
     * 无参（没有参数）构造器
     * 构造器的名称必须与类名称相同，并且不能有返回值
     * public Animal(){} 写不写都可以，默认提供
     * 如果写了构造器，那么系统默认的构造器就不再提供
     */
    String name;
    String color;
    int age;

    // 构造器用来初始化变量
    public Animal() {
        name = "animal";
    }

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("说话");
    }
}

class UseAnimal {
    public static void main(String[] args) {
//        Animal animal = new Animal();
//        System.out.println(animal.age);
//        animal.age = 2;
//        System.out.println(animal.age);
        System.out.println(new Animal());
        Animal animal = new Animal("猫", "蓝色", 2);
        System.out.println(animal.age);
        animal.speak();
    }
}
