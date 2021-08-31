package com.workshops.javasamples.grokkingjavainterview;

public class Employee {

    private String name;
    private int age;
    private int salary;

    public Employee(){
        this("Mike");
    }

    public Employee(String name) {
        this(name,20);
    }

    public Employee(String name, int age) {
        this(name,age, 20000);
    }

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void print() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Salary = " + salary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.print();
    }
}
