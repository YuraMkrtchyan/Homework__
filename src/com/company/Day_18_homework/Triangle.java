package com.company.Day_18_homework;

public class Triangle {

//3. Write a Triangle class which `
//- has a sideA, sideB, sideC
//-	write getters and setters for that
//- all sides must be in range 1 - 20
//- define constructor
//-	also your class must have an isTriangleValid() private method.
//- and also a public check() method which will get as a parameter triangle
//  object and will call isValidTriangle() method.
//- also add a method which will check if your triangle is right or not.
//- if the triangle is right, then count square else count perimeter.
//- use method overloading

    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    private boolean isValidTriangle() {
        return (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA);
    }

    public boolean areSidesInRange() {
        return (sideA >= 1 && sideB >= 1 && sideC >= 1 && sideA <= 20 && sideB <= 20 && sideC <= 20);
    }

    public boolean isRight() {
        if (sideA > sideB && sideA > sideC) {
            return (sideA * sideA == sideB * sideB + sideC * sideC);
        } else if (sideB > sideA && sideB > sideC) {
            return (sideB * sideB == sideA * sideA + sideC * sideC);
        } else {
            return (sideC * sideC == sideA * sideA + sideB * sideB);
        }
    }

    public void check(Triangle triangle) {
        System.out.println(isValidTriangle());
    }

    private boolean b = isRight();

    public double count(int sideA, int sideB, int sideC, int p) {
        double d = p * (p - sideA) * (p - sideB) * (p - sideC);
        return (Math.sqrt(d));
    }

    public int count(int sideA, int sideB, int sideC) {
        return sideA + sideB + sideC;
    }
}
