package com.company.Day_20_homework.task1;

public abstract class Shape {
//1. Write a java program which`
// - has a Shape abstract class with methods getArea(), getPerimeter(),
//   which get as a parameter double radius and have a protected access modifier
// - create a Circle class which extends from Shape abstract class and overrides its methods.
// - create a Square class which extends from Shape abstract class and overrides its methods.

    private double radius;

    public Shape(double radius) {
        this.radius = radius;
    }
    public Shape() {}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    protected abstract double getArea();
    protected abstract double getPerimeter();
}
