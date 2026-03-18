public class Student extends Person {
    String level;

    @Override // 重写
    public boolean equals(Object obj) {
        if (obj == null) { return false; }
        if (obj instanceof Student student) {
            return student.name.equals(this.name) &&
                    student.gender.equals(this.gender) &&
                    student.age == this.age &&
                    student.level.equals(this.level);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Person{" + name + ", " + gender + ", " + age + ", " + level + '}';
    }

    public Student(String name, String gender, int age, String level) {
        super(name, age, gender);
        this.level = level;
    }

    void study() {
        System.out.println(name + " is studying");
    }
}
