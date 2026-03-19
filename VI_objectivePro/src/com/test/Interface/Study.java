package com.test.Interface;

public interface Study {
    void study();

    // 默认实现，有默认实现的方法对继承子类不做强制要求
    default void studyPro() {
        System.out.println("Study Pro");
    }

    // 静态变量和静态方法
    public static int staticInt = 100;

    public static void staticFunc() {
        System.out.println("Static Func");
    }
}
