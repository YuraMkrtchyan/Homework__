package com.company.Day_21_homework.task1;

public abstract class Animal {
//1. Create an animal class which has sound method()
//- now create subclasses of Animal class Horse and Cat
//-	for each of them override sound() method
//-	in main method create objects for each class

    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{}";
    }

    public abstract void sound();
}
