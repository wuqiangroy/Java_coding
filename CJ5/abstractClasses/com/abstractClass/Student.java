package com.abstractClass;


public class Student extends Person {
    private String major;

    public Student(String aName, String aMajor) {
        super(aName);
        major = aMajor;
    }

    public String getDescription() {
        return String.format("a student majoring in %s", major);
    }
}