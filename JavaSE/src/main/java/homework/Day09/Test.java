package homework.Day09;

/**
 * @program: Data_Study
 * @description: Day09 作业
 * @author: HaoMiao
 * @create: 2019-11-03 07:05
 **/
public class Test {
    public static void main(String[] args) {
        Person person = new Person("张三", 18);
        System.out.println(person.say());
        Student student = new Student("王二麻子", 21, 1000L, 99);
        System.out.println(student.say());
    }
}
