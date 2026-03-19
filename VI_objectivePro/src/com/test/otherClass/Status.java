package com.test.otherClass;

public enum Status {
    GOOD("很好"),
    FINE("还好"),
    BAD("不好");

    private String name;
    Status(String name) { this.name = name; }
    public String getName() { return name; }
}
