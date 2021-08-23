package com.workshops.javasamples;

public class StudentBuilder {

    private String name;
    private int age = 14;
    private String motto;

    public StudentBuilder() {}

    public Student buildStudent(){
        return new Student(name, age, motto);
    }

    public StudentBuilder name(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder age(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder motto(String motto) {
        this.motto = motto;
        return this;
    }


}
