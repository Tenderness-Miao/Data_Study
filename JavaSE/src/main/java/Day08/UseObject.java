package Day08;

public class UseObject {
    public static void main(String[] args) {
        myself m = new myself("安平", "厚眼镜", 15);
        System.out.println(m);
        TellMyself(m);
    }

    public static void TellMyself(myself m) {
        System.out.println(m.getName() + ":" + m.getAge() + "," + m.getDescribe());
    }
}

class myself {
    private String name;
    private String describe;
    private int age;

    public myself() {
    }

    public myself(String name, String describe, int age) {
        this.name = name;
        this.describe = describe;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
