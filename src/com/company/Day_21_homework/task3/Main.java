package com.company.Day_21_homework.task3;

public class Main {
//- create in main method Animal object,
// Cat object with Animal type reference, and Cat object with Cat type
    public static void main(String[] args) {
        Animal animal = new Animal(10, "Buddy");
        System.out.println(animal.toString());
        animal.sound();

        Animal animal1 = new Cat(5, "Leo");
        System.out.println(animal1.toString());
        animal1.sound();

        Cat cat = new Cat(7, "Simba");
        System.out.println(cat.toString());
        cat.sound();
    }
}
