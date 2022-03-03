package com.company.Day_19_homework.task1;

import com.company.Day_19_homework.task1.Animal;

public class Dog extends Animal {
    @Override
    protected void voice() {
        System.out.println("voice override");
    }
    @Override
    protected void eat() {
        System.out.println("eat override");
    }
}
