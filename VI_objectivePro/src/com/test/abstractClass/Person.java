package com.test.abstractClass;

public abstract class Person { // 抽象类
    protected String name;
    protected String gender;
    protected int age;

    public Person() {}
    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    protected abstract void greet(); // 抽象方法
}
