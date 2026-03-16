public class PersonPro {
    private String name;
    private String gender;
    private int age;

    private PersonPro() {}
    private PersonPro(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    
    public static PersonPro newInstance(String name, String gender, int age) {
        if (name.contains("fuck") || age < 0 || gender.contains("mtf")) {
            System.out.println("Please enter your real info");
            return null;
        }
        return new PersonPro(name, gender, age);
    }
    public static PersonPro newInstance() {
        return new PersonPro();
    }

    public void printInfo() {
        System.out.println("---------------");
        System.out.println("Name:\t" + name + "\nGender:\t" + gender + "\nAge:\t" + age);
        System.out.println("---------------");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.contains("fuck")) {
            System.out.println("Please enter your name");
            return;
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
