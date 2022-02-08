package com.company.day5;

public class Person {
    public String name;
    public int age;
    public String address;

    public Person(){
        super();
    }

    public Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;

    }

    public void info(String name, int age, String address){
        System.out.print(name + "\t");
        System.out.print(age + " years old\t");
        System.out.println(address);
    }

}
