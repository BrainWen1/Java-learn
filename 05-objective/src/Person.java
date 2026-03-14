public class Person {
    String name;
    int age;
    String gender;

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
