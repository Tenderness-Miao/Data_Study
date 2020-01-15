package Day12;

public class Test {
    public static void main(String[] args) {
        ThreeKingdoms wu = new ThreeKingdoms("吴", "孙权", "周瑜", 10);
        // println里面调用了toString方法
        System.out.println(wu);
        JourneyTheWest jTW = new JourneyTheWest();
        ThreeKingdoms shu = new ThreeKingdoms();
        ThreeKingdoms wu1 = new ThreeKingdoms("吴", "孙权", "周瑜", 10);
        boolean flag = wu.equals(jTW);
        boolean flag1 = wu.equals(shu);
        boolean flag2 = wu.equals(wu1);
        // 重写equals方法和hashCode方法过后
        // 如果对象的内容完全一样，那么就返回true，否则返回false
        System.out.println(flag);
        System.out.println(flag1);
        System.out.println(flag2);
    }
}
