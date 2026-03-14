import java.awt.*;

public class Person {
    String name = test();
    int age;
    String gender;
    static String info = "nb666";

    static void staticInfo() {
        System.out.println(info);
    }

    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        System.out.println("Person()");
    }

    Person() {}

    String test() {
        System.out.println("test()");
        return "ppp";
    }

    void hello() {
        System.out.println("hello, my name is " + name + ". I am " + age);
    }

    // 重载
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    // this
    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
