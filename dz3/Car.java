package com.test.Car;

public abstract class Car implements CarInterface {

    protected String model;
    protected Integer speed;
    protected String color;

    @Override
    public void gas(int number) {
        System.out.println("gas:" + number);
    }

    @Override
    public void brake(int number) {
        System.out.println("brake:" + number);
    }

    @Override
    public abstract void description();

}
