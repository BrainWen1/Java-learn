public final class ArtTeacher extends Teacher { // final关键字 不可继续继承
    String name;

    public ArtTeacher(String name, int age, String gender) {
        super(name, age, gender);
    }

    void draw() {
        System.out.println("Art Teacher " + name + " is drawing");
    }
}
