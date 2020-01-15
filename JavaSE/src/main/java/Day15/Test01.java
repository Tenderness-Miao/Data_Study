package Day15;

/**
 * 数组不是动态的，一个数组一旦被创建容量就不能被修改
 * 要扩容就必须重新创建新的大的数组
 * <p>
 * 集合：
 * 集合是动态的，集合动态的添加，删除
 * java中有一系列的集合，各有各的用途
 * <p>
 * 集合中只能保存引用类型，不支持基本数据类型，可以用包装类，集合里面的数据叫元素
 * Collection接口定义了所有接口必须去实现的通用方法
 * java中没有提供collection接口的具体实现类
 * 而是提供了子接口List和Set的具体实现类
 */
public class Test01 {
    public static void main(String[] args) {
        String[] arr = {"", ""};
        // 容量是确定的
        int[] ints = new int[10];
    }
}
