public class Student extends Person {
    String level;

    public Student(String name, String gender, int age, String level) {
        super(name, age, gender);
        this.level = level;
    }

    void study() {
        System.out.println(name + " is studying");
    }
}
