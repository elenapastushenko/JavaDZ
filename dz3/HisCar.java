package com.test.Car;

public class HisCar implements CarInterface {

    @Override
    public void gas(int number) {
        System.out.println("gas(" + number + ")");
    }

    @Override
    public void brake(int number) {
        System.out.println("brake:" + number);
    }

    @Override
    public void description() {
        System.out.println("McLaren F1");
    }
}
