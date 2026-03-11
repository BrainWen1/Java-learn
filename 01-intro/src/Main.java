// Java基本格式 注释 变量与常量
public class Main {
    public static void main(String[] args) {
        System.out.print("Hello!");
        System.out.println(" World!");

        // 这是一个注释

        /*
         * 这是多行注释
         * 可以一次性注释很多行
         */

        // 变量和常量
        int a = 100;
        System.out.println("a = " + a);
        a = 666;
        System.out.println("a = " + a);
        int b = a;
        System.out.println("b = " + b);
        a = b + 1;
        System.out.println("a = " + a);

        final int c = a;
        System.out.println("c = " + c);
        // c = 10; 被final修饰的变量不可修改，相当于const
        final int d;
        d = 10;
        // d = 100; 未初始化也只有第一次赋值有效
        System.out.println("d = " + d);
    }
}