package com.test.Car;

public class MyCar extends Car {

    public static void main(String[] args) {
        MyCar car = new MyCar("Tesla Model X", 300, "White metallic");
        car.gas(60);
        car.brake(10);
        car.description();
    }

    public MyCar(String model, Integer speed, String color) {
        this.model = model;
        this.speed = speed;
        this.color = color;
    }

    @Override
    public void description() {
        System.out.println(
                "model:" + model +
                "\nspeed:" + speed +
                "\ncolor:" + color
        );
    }
}
