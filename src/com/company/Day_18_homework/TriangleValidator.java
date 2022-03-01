package com.company.Day_18_homework;

public class TriangleValidator {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        Triangle triangle = new Triangle(a, b, c);
        System.out.println(triangle.areSidesInRange());
        System.out.println(triangle.isRight());
        triangle.check(triangle);

        int perimeter = triangle.count(a, b, c);
        double square = triangle.count(a, b, c, perimeter);
        boolean bool = triangle.isRight();

        if (bool) {
            System.out.println(square);
        } else {
            System.out.println(perimeter);
        }
    }
}
