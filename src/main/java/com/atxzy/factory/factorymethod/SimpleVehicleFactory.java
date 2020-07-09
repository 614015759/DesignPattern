package com.atxzy.factory.factorymethod;

/**
 * 简单工厂，可扩展性并不好
 */
public class SimpleVehicleFactory {

    public Car createCar(){
        //before processing
        return new Car();
    }

    public Plane createPlane(){

        return new Plane();
    }
}
