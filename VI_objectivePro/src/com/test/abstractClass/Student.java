package com.test.abstractClass;

public class Student extends Person {
    public Student() {}
    public Student(String name, String gender, int age) {
        super(name, gender, age);
    }

    @Override
    public void greet() {
        System.out.println("Hello, I am student");
    }
}
