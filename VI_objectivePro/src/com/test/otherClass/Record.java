package com.test.otherClass;

public record Record(int number, String name) {
    @Override
    public int number() {
        System.out.println("override number func");
        return number;
    }
}
