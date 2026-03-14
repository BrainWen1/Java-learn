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
    }
}
