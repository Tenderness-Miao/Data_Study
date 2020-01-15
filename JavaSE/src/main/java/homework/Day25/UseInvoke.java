package homework.Day25;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class UseInvoke {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class c = String.class;
        String str = "hello";
        Method indexOf = c.getDeclaredMethod("indexOf", int.class);
        int i = (int) indexOf.invoke(str, (int) 'o');
        System.out.println(i);

        Method endsWith = c.getDeclaredMethod("endsWith", String.class);
        boolean b = (boolean) endsWith.invoke(str, "o");
        System.out.println(b);

        Method replace = c.getDeclaredMethod("replace", char.class, char.class);
        String newStr = (String) replace.invoke(str, 'l', 'o');
        System.out.println(newStr);
    }
}
