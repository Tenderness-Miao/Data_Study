package Day08;

public class Animal {
    private String name = "小猫";
    private int age;
    private String color;

    public Animal() {
    }

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class UseAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("小狗");
        System.out.println(animal.getName());

        Animal animal1 = new Animal("小猫", 2, "花色");
        System.out.println(animal1.getAge());
    }
}