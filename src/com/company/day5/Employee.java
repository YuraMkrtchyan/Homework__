package com.company.day5;

public class Employee {
    int id;
    String name;
    String department;
    int age;
    char gender;
    int salary;
    String eMail;

    public Employee(){
        this(0, null,  null, 0, '\u0000', 0, null);
    }
    public Employee(int id, String name, String department, int age, char gender, int salary, String eMail) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.eMail = eMail;
    }

    public Employee(String name, int salary){
        this(0, name, null, 0, ' ', salary, null);
    }

    public void info() {
        System.out.println("ID:" + id + "\tname:" + name + "\tdepartment:" +
                          department + "\tage:" + age + "\tgender:" + gender + "\tsalary:" + salary + "\teMail:" + eMail);
    }


}
