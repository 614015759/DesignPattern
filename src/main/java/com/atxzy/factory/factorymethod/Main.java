package com.atxzy.factory.factorymethod;

import com.atxzy.factory.factorymethod.AbstractFactory.AK47;
import com.atxzy.factory.factorymethod.AbstractFactory.bread;

public class Main {

    public static void main(String[] args) {
        Car c = new Car();
        c.go();
        AK47 w = new AK47();
        w.shoot();
        bread b = new bread();
        b.printName();
    }
}
