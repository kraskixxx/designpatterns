package com.workshops.javasamples.grokkingjavainterview;

class EmployeeCompany extends Company{

    public EmployeeCompany() {
        super("Mike", 20);
    }

    public EmployeeCompany(String name) {
        this();
    }
}

class ConstructorChaining {
    public static void main(String[] args) {

        EmployeeCompany employeeCompany = new EmployeeCompany();
        employeeCompany.display();

    }
}
