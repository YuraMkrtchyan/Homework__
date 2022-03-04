package com.company.Day_21_homework.task3;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(int age, String name) {
        super(age, name);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void sound() {
        System.out.println("task 3 Cat");
    }
}
