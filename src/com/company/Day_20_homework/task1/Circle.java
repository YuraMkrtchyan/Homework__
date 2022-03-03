package com.company.Day_20_homework.task1;

public class Circle extends Shape {
    Circle(){
        super();
    }

    public Circle(double radius) {
        super(radius);
    }

    @Override
    protected double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    protected double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }
}
