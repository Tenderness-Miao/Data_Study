package homework.Day09;

/**
 * @program: Data_Study
 * @description: Day09 Person类
 * @author: HaoMiao
 * @create: 2019-11-03 06:33
 **/
public class Person {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String say() {
        return "我叫" + getName() + " 我是：" + getClass().getName();
    }
}
