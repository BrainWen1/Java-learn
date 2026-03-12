// 赋值 算术 括号 递变 位运算 关系 逻辑
public class Main {
    public static void main(String[] args) {
        // 赋值运算符 =
        int i = 100;
        System.out.println(i);
        i = 200;
        System.out.println(i);

        // 算术运算符 + - * / %
        // 小整数类型自动转换成int类型，无论是否出现int类型。
        // 如果出现long类型，则自动转换成long类型
        short s1 = 1;
        short s2 = 2;
        var v1 = s1 + s2; // int

        long l1 = 3;
        var v2 = s1 + l1; // long

        System.out.println(v1 + "\n" + v2);

        // 出现浮点型则向浮点型转换
        float f1 = 3.14f;
        var v3 = f1 + l1; // float
        System.out.println(v3);

        char c = 'a';
        char c2 = (char)(c - 32);
        int i1 = c - 32;
        System.out.println(c2 + " = " + i1);

        int a = 8, b = 5;
        float f = 1.0f * a / b;
        System.out.println(f);

        System.out.println(a % b);

        // 括号运算符
        int ret = 1 + 2 * 3;
        System.out.println(ret);
        ret = (1 + 2) * 3;
        System.out.println(ret);

        // 强制类型转换
        byte b1 = (byte)ret;
        System.out.println(b1);
        ret = 1000;
        b1 = (byte)ret; // 精度丢失
        System.out.println(b1); // -24

        //递变运算符
        // 前置：右值，先加后用
        // 后置：左值，先用后加
        ret = 0;
        System.out.println(ret++); // 0
        System.out.println(++ret); // 2

        ret = 8;
        int r1 = -a++ + ++a;
        System.out.println(r1); // 2

        // 位运算符 & | ^ ~ << >>
        // 所有位运算都是针对补码
        a = 9; // 1001
        b = 3; // 0011
        ret = a & b; // 0001 = 1
        System.out.println(ret);
        ret = a | b; // 1011 = 11
        System.out.println(ret);
        ret  = a ^ b; // 1010 = 10
        System.out.println(ret);
        ret = ~a; // 0000 0000 0000 1001 -> 1111 1111 1111 0110 -> 1000 0000 0000 1010 = -10
        System.out.println(ret);
        ret = a << 1; // 0000 0000 0001 0010 = 18
        System.out.println(ret);
        ret = a >> 1; // 0000 0000 0000 0100 = 4
        System.out.println(ret);
        a = -9; // 1000 0000 0000 1001 -> 1111 1111 1111 0111
        ret = a << 1; // 1111 1111 1110 1110 -> 1000 0000 0001 0010 = -18
        System.out.println(ret);
        ret = a >> 1; // 1111 1111 1111 1011 -> 1000 0000 0000 0101 = -5
        System.out.println(ret);

        // 关系运算符 > < == != >= <=
        a = 10;
        b = 20;
        boolean bool = a > b;
        System.out.println(bool);

        // 逻辑运算符 && || !
        bool = true && false;
        System.out.println(bool);

        bool = false || true;
        System.out.println(bool);

        bool = !bool;
        System.out.println(bool);

        // 短路求值：从左往右判断，如果某个位置以及可以判断当前语句的true/false，则后续的判断语句不会执行
        a = 10;
        bool = a++ > 10 && ++a == 12;
        System.out.println(a + "\n" +bool); // 11  false

        // 三元运算符
        c = a > 10 ? 'A' : 'a';
        System.out.println(c);
    }
}
