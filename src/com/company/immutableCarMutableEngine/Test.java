package com.company.immutableCarMutableEngine;

public class Test {
    public static void main(String[] args) {
        Engine engine = new Engine(200, 50000, 1300);
        Car car = new Car(2000, "Audi", "A6",
                  new Engine(200, 50000, 1300));
        System.out.println(car.toString());
        System.out.println(engine.toString());

        car.getEngine().setHorsePow(55);
        System.out.println(car.toString());


    }
}
