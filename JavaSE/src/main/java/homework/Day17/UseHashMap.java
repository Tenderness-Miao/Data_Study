package homework.Day17;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UseHashMap {
    public static void main(String[] args) {
        HashMap<Husband, Wife> map = new HashMap<>();
        map.put(new Husband("大雄", "男"), new Wife("静香", "女"));
        map.put(new Husband("jack", "男"), new Wife("rose", "女"));
        Set<Husband> husbands = map.keySet();
        for (Husband hb : husbands) {
            System.out.println(hb + ":" + map.get(hb));
        }
        Set<Map.Entry<Husband, Wife>> set = map.entrySet();
        for (Map.Entry<Husband, Wife> entry : set) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}

class Husband {
    private String name;
    private String gender;

    public Husband(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Husband{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

class Wife {
    private String name;
    private String gender;

    public Wife(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
