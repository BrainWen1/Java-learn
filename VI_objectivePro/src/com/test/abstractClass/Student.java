package com.test.abstractClass;

import com.test.Interface.*;

public class Student extends Person implements Study, Play, PlayAndStudy, Cloneable {
    public Student() {}
    public Student(String name, String gender, int age) {
        super(name, gender, age);
    }

    @Override
    public void greet() {
        System.out.println("Hello, I am student, my name is " + name);
    }

    @Override
    public void study() {
        System.out.println(name + " is studying Java.");
    }

    @Override
    public void play() {
        System.out.println(name + " is playing MineCraft.");
    }

    @Override
    public void PlayAndStudy() {
        System.out.println(name + " is playing while studying.");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
