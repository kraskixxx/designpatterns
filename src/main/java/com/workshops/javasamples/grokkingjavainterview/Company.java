package com.workshops.javasamples.grokkingjavainterview;

public class Company {

    private String name;
    private int age;

    public Company(String name){
        System.out.println("ABC Company");
        System.out.println("Details : ");
    }

    public Company(String name, int age) {
        this(name);
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
    }
}
