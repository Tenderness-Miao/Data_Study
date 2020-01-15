package Day14;

public class Test {
    public static void main(String[] args) {
        // Day是一个类型，枚举类型，引用类型
        // enum里面的变量天然的是static final修饰的
        // 声明一个Day类型变量monday，将枚举值Day.monday赋值给monday
        Day monday = Day.MONDAY;
        switch (monday) {
            case MONDAY:
                System.out.println("星期一");
                break;
            case TUESDAY:
                System.out.println("星期二");
                break;
            case WEDNESDAY:
                System.out.println("星期三");
                break;
            case THURSDAY:
                System.out.println("星期四");
                break;
            case FRIDAY:
                System.out.println("星期五");
                break;
            case SATURDAY:
                System.out.println("星期六");
                break;
            case SUNDAY:
                System.out.println("星期日");
                break;
            default:
                System.out.println("不知道");
                break;
        }

        // 使用enum 关键字声明一个枚举类，编译器再创建枚举的时候自动添加一些特殊的方法
        // 每一个枚举抖音一个静态的values方法，是编译器自己加的
        // 返回的是包含了所有枚举值的数组
        Day[] arr = Day.values();
        for (Day item : arr) {
            System.out.println(item);
        }

        System.out.println("**********************");

        // 将字符串转换成枚举Day.SUNDAY
        Day d1 = Day.valueOf("SUNDAY");
        System.out.println(monday.name());
        // Day.SUNDAY转换成字符串
        System.out.println(d1.name());
        System.out.println(d1.toString());
        System.out.println(Day.SUNDAY.ordinal());

        // 枚举的比较
        Day m1 = Day.MONDAY;
        Day m2 = Day.MONDAY;
        System.out.println(m1);
        System.out.println(m1 == m2);
        System.out.println(m1.equals(m2));
    }
}
