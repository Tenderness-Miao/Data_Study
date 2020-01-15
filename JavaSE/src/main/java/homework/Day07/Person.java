package homework.Day07;

/**
 * @program: Data_Study
 * @description: Person类
 * @author: HaoMiao
 * @create: 2019-10-30 20:36
 **/
public class Person {
    String name;
    static int age;
    String gender;

    public Person() {
    }

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public static String play() {
        return "打篮球";
    }

    public void swim() {
        System.out.println(name + "去" + gender + "泳池游泳");
    }
}
