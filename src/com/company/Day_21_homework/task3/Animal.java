package com.company.Day_21_homework.task3;

public class Animal {
//3. Write an animal class
//- with fields age, name and with method sound()
//- write a Cat class which extends from Animal, overrides a sound method also has an age and name
//- create in main method Animal object, Cat objects with Animal type reference, and Cat object with Cat type
//- Call and print for all created objects its methods and fields
    private int age;
    private String name;

    public Animal() {
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public void sound(){
        System.out.println("task 3 Animal");
    }

}
