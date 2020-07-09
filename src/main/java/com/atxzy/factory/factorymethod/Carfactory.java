package com.atxzy.factory.factorymethod;

public class Carfactory {
    public Car CreateCar(){
        System.out.println("a car created");

        return new Car();
    }
}
