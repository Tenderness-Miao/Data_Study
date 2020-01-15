package Day09;

public class Animal {
    private String name;
    protected String color;
    public int age=1;
    char gender;

    public static void anotherMethod(){
        System.out.println("静态的方法不能被重写");
    }

    public void voice(){
        System.out.println("发出声音");
    }

    public Animal(){
        System.out.println("Animal的空参构造被调用");
    }

    public Animal(String name, String color, int age, char gender) {
        System.out.println("Animal的满参构造被调用");
        this.name = name;
        this.color = color;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
