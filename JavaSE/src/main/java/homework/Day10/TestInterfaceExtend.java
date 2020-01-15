package homework.Day10;

/**
 * @program: Data_Study
 * @description: Day10 接口继承测试类
 * @author: HaoMiao
 * @create: 2019-11-03 22:48
 **/
public class TestInterfaceExtend {
    public static void main(String[] args) {
        TestInterface testInterface = new TestInterface();
        System.out.println(testInterface.eat());
        System.out.println(testInterface.speak());
        System.out.println(testInterface.sing());
    }
}
