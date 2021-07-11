package com.company;

public class Main {

    public static void main(String[] args) {

        MyCar nissan = new MyCar(160,"Note","White");
        nissan.description();
        nissan.gas(100);
        nissan.brake(20);
        HisCar mazda = new HisCar(200,"CX-5","Red");
        mazda.description();
        mazda.gas(150);
        mazda.brake(40);
    }
}
