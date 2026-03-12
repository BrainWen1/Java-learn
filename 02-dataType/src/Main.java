// 整型 浮点型 字符型 布尔类型 var关键字
public class Main {
    public static void main(String[] args) {
        // 整型
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40; // 40这个字面量默认是int类型，这里发生了隐式类型转换
        long L = 123456789876L; // 末尾不加L会报错，因为数值超过了int类型数据所能表示的范围

        int sixteen = 0xA12F; // 0x 表示十六进制
        System.out.println(sixteen);
        int eight = 0123; // 0 表示八进制
        System.out.println(eight);

        // 浮点型
        float f = 3.14f;
        double d = 3.14;
        System.out.println("f = " + f + " | d = " + d);

        float f2 = L;
        System.out.println(f2);

        // 字符型
        char c = 'A';
        System.out.println(c);
        c = 97;
        System.out.println(c);

        char c1 = '\''; // 转义字符
        System.out.println(c1);

        char c2 = '我'; // 中文
        System.out.println(c2);

        // 布尔类型
        boolean bool = true; // 大小由JVM决定
        boolean bool2 = false;
        boolean bool3 = bool2;
        System.out.println(bool + " " + bool2 + " " + bool3);

        // var 自动类型推断
        var v1 = 1;
        var v2 = 3.14;
        var v3 = 'p';
        System.out.println(v1 + " " + v2 + " " + v3);
    }
}
