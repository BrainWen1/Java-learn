public class Teacher extends Person {
    String name;

    public Teacher(String name, int age, String gender) {
        super(name, age, gender);
    }

    void teach() {
        System.out.println("teacher " + super.name + " is teaching");
    }
}
