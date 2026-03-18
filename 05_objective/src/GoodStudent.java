public class GoodStudent extends Student {
    GoodStudent(String name, String gender, int age, String level) {
        super(name, gender, age, level);
    }

    @Override
    public void study() {
        System.out.println(name + " is focusing on studying");
    }
}
