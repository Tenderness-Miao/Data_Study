package Day14;

import java.io.IOException;

public class Test02 {
    // 异常可以传播
    public static void main(String[] args) throws Exception {
        method1();
        System.out.println("调用完method1");//不执行
    }

    /**
     * 处理异常: try{}catch(){ }finally{ }
     * throws 抛出去
     * <p>
     * 异常的顶层类是Throwable.  Error 和 Exception都都继承自Throwable类
     * Error在代码中不能处理,但是Exception可以处理
     * StackOverFlowError    OutOfMemoryError错误.   通常没有办法捕获.
     * 受检查异常:编译不通过,直接爆红
     * 运行时异常:编译通过,但是运行是报异常.
     *
     * @throws IOException
     */

    public static void method1() throws IOException {
        method2();
        System.out.println("调用完method2");//不执行
    }


    //Alter + enter


    public static void method2() throws IOException {
        //FileInputStream fis = new FileInputStream("E://");

        try {
            //fis.read();
            //写你觉得可能有异常的代码
            String str = "asdf";
            System.out.println(str.toString());
            ;//空指针异常  NullPointerException

        } catch (NullPointerException e) {
            System.out.println("逮到异常");

        } finally {
            //无论捕获到或者没有捕获到异常,最后都会执行里边的代码
            //fis.close();
        }

        System.out.println("空指针异常");//异常下边的语句不能执行,因为异常会导致执行终止
    }
}
