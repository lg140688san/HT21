package com.company;

public abstract class Car {
    String model;
    int speed;
    String color;

    void gas(int gas){
System.out.println("gas:" + gas);

    }

    void brake(int brake){
        System.out.println("brake:" + brake);

    }
    abstract void description();

}
