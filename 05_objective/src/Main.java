public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = p1;
        System.out.println(p1 == p2);

        Person p3 = new Person();
        System.out.println(p1 == p3);

        System.out.println("name = " + p1.name);
        System.out.println("age = " + p1.age);
        System.out.println("gender = " + p1.gender);

        p1.name = "David";
        p2.name = "Steve";
        p3.name = "Mary";
        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p3.name);

        p1.age = 18;
        p3.age = 17;
        p1.hello();
        p3.hello();

        System.out.println(p1.add(1, 2));

        modify(p1);
        System.out.println(p1.name);

        p1.setName("miku");
        System.out.println(p1.getName());

        System.out.println(p1.add(1.2, 2.3));

        Person p4 = new Person("xiaomin", 19, "man");

        Test t1 = new Test();

        System.out.println(p1.info);
        System.out.println(p4.info);
        System.out.println(Person.info);
        Person.staticInfo();
    }

    static void modify(Person p) {
        p.name = "lbwnb";
    }
}
