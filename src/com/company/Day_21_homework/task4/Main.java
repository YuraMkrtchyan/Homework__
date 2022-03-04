package com.company.Day_21_homework.task4;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(3, 7);

        Shape[] arr = {square, circle, rectangle};
        for (Shape shape : arr) {
            System.out.println(shape.area());
            System.out.println(shape.perimeter());
        }
    }
}
