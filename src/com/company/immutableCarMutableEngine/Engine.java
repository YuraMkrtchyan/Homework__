package com.company.immutableCarMutableEngine;

public class Engine{
    private int horsePow;
    private int mileage;
    private int weight;

    public Engine(int horsePow, int mileage, int weight) {
        this.horsePow = horsePow;
        this.mileage = mileage;
        this.weight = weight;
    }

    public Engine(Engine engine){
        this.horsePow = engine.horsePow;
        this.mileage = engine.mileage;
        this.weight = engine.weight;
    }

    public int getHorsePow() {
        return horsePow;
    }

    public final void setHorsePow(int horsePow) {
        this.horsePow = horsePow;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePow=" + horsePow +
                ", mileage=" + mileage +
                ", weight=" + weight +
                '}';
    }
}
