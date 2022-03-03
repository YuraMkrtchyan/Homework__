package com.company.Day_20_homework.task1;

public class Square extends Shape{

    Square(double radius){
        super(radius);
    }

    @Override
    protected double getArea() {
        return getRadius() * getRadius();
    }

    @Override
    protected double getPerimeter() {
        return 4 * getRadius();
    }


}
