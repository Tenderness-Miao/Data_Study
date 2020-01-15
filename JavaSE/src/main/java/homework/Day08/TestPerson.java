package homework.Day08;

/**
 * @program: Data_Study
 * @description: Day08 Person作业
 * @author: HaoMiao
 * @create: 2019-10-30 21:24
 **/
public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("李四");
        person.setAge(19);
        person.setGender('男');
        person.setSchool("北京大学");
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getGender());
        System.out.println(person.getSchool());
    }
}
