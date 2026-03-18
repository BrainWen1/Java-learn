public class Main {
    public static void main(String[] args) {
        module5();
    }

    public static void module5() {
        Student student1 = new Student("xiaomin", "man", 18, "middle");
        Student student2 = new Student("xiaomin", "man", 18, "middle");
        System.out.println(student1.equals(student2));

        Person person1 = new Person("xiaomin", 18, "man");
        Person person2 = new Person("xiaomin", 18, "man");
        System.out.println(person1.equals(person2));

        System.out.println(student1.toString()); // 不重写则输出 Student@5674cd4d

        GoodStudent gs = new GoodStudent("xiaomin", "man", 18, "middle");
        BadStudent bs = new BadStudent("xiaohong", "man", 18, "middle");
        gs.study();
        bs.study();
    }

    public static void module4() {
        Person p = new Student(null, null, 0, null);
        p.hello();
        Student stu = (Student) p;
        stu.study();

        Student s = new Student(null, null, 0, null);
        Teacher t = new Teacher(null, 0, null);
        test(s);
        test(t);
    }

    private static void test(Person p) {
        if (p instanceof Student s) { // (Java16) 类型判断模式匹配
            s.study();
        } else if (p instanceof Teacher t) {
            t.teach();
        }
    }

    public static void module3() {
        Student student = new Student("david", "man", 18, "A-");
        student.hello();
        student.study();

        Teacher teacher = new Teacher(null, 0, null);
        teacher.hello();
        teacher.teach();

        ArtTeacher artTeacher = new ArtTeacher(null, 0, null);
        artTeacher.hello();
        artTeacher.teach();
        artTeacher.draw();
    }

    public static void module2() {
        PersonPro pp = PersonPro.newInstance();
        pp.setName("bob");
        pp.setAge(23);
        pp.setGender("man");
        pp.printInfo();

        pp.setName("fuck u");
        pp.printInfo();
    }

    public static void module1() {
        Person p1 = new Person(null, 0, null);
        Person p2 = p1;
        System.out.println(p1 == p2);

        Person p3 = new Person(null, 0, null);
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
