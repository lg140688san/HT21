package com.company;

public class MyCar extends Car {
    @Override
    void description() {
        System.out.println("MaxSpeed - " + speed);
        System.out.println("Model - " + model);
        System.out.println("Color - " + color);
    }
    public MyCar(int speed, String model, String color){
        this.speed = speed;
        this.model = model;
        this.color = color;

    }
}
