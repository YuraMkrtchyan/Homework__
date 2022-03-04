package com.company.Day_21_homework.task1;

import com.company.Day_21_homework.task1.Animal;

public class Horse extends Animal {

    public Horse() {
    }

    @Override
    public String toString() {
        return "Horse{}";
    }

    @Override
    public void sound() {
        System.out.println("Horse class");
    }
}
