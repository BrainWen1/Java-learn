package com.test.abstractClass;

import com.test.otherClass.*;

public abstract class Person { // 抽象类
    protected String name;
    protected String gender;
    protected int age;
    protected Status status;

    public Person() {}
    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    protected abstract void greet(); // 抽象方法

    @Override
    public String toString() {
        return getClass() + "{name: " + name + ", gender: " + gender + ", age: " + age + "}";
    }

    // Status
    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }
}
