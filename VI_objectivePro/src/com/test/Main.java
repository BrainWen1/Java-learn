package com.test;

import com.test.abstractClass.*;
import com.test.Interface.*;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        module1();
    }

    private static void module1() throws CloneNotSupportedException {
        // Person person = new Person(); // 'Person' 为 abstract；无法实例化
        Student student = new Student();
        student.greet();
        student.study();
        student.play();

        Study study = new Student("xiaomin", "man", 18);
        study.study();

        student = (Student) study;
        student.greet();
        student.study();
        student.play();

        student.PlayAndStudy();

        Student student2 = (Student) student.clone();
        student2.greet();
        System.out.println(student); // 二者成员变量完全相同
        System.out.println(student2);
        System.out.println(student == student2); // false: 并非同一对象

        student.studyPro();
        System.out.println(Study.staticInt);
        Study.staticFunc();
    }
}
