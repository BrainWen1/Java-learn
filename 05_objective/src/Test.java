public class Test {
    String name = test();  //这里我们用test方法的返回值作为变量的初始值，便于观察
    int age;
    String sex;

    {
        System.out.println("我是普通代码块");
    }

    Test() {
        System.out.println("我是构造方法");
    }

    String test(){
        System.out.println("我是成员变量初始化");
        return "小明";
    }

    static String info = init();   //这里我们用init静态方法的返回值作为变量的初始值，便于观察

    static {
        System.out.println("我是静态代码块");
    }

    static String init(){
        System.out.println("我是静态变量初始化");
        return "test";
    }
}