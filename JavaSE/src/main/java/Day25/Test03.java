package Day25;

import java.lang.reflect.Field;

public class Test03 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Student stu1 = new Student("森林之王", 18);
        Student stu2 = new Student("谷伟太原", 17);

        // 获取Student类对象
        Class stuClass = Student.class;
        // 获取Student类中的Name属性
        Field nameField = stuClass.getDeclaredField("name");

        // 设置Student类中的name属性的访问权限
        nameField.setAccessible(true);

        // 获取Student类中的stu1中Name属性值
        String stu1Name = (String) nameField.get(stu1);
        System.out.println(stu1Name);

        // 获取Student类中的stu2中Name属性值
        String stu2Name = (String) nameField.get(stu2);
        System.out.println(stu2Name);

        // 设置Student类中的age属性的访问权限
        Field ageField = stuClass.getDeclaredField("age");
        ageField.setAccessible(true);
        // 获取Student类中stu1中的age属性值
        int stu1Age = ageField.getInt(stu1);
        System.out.println(stu1Age);
    }
}
