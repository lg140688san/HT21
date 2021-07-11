package com.company;


public class HisCar implements CarInterface {

    String model;
    int speed;
    String color;


    @Override
    public void gas(int gas) {
        System.out.println("gas:" + gas);

    }

    @Override
    public void brake(int brake) {
        System.out.println("brake:" + brake);

    }

    @Override
    public void description() {
        System.out.println("MaxSpeed - " + speed);
        System.out.println("Model - " + model);
        System.out.println("Color - " + color);

    }
    public HisCar(int speed, String model, String color){
        this.speed = speed;
        this.model = model;
        this.color = color;

    }

}
