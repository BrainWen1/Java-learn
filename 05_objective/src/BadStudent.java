public class BadStudent extends Student {
    BadStudent(String name, String gender, int age, String level) {
        super(name, gender, age, level);
    }

    @Override
    public void study() {
        System.out.println(name + " is studying without attention");
    }
}
