package com.atxzy.prototype.improve;

import com.atxzy.prototype.improve.Sheep;

public class Client {
    public static void main(String[] args) {
        //传统的方法解决

        Sheep sheep = new Sheep("tom", 1, "白色");
        sheep.friend = new Sheep("tomtt",2,"黑色");
        Sheep sheep1 =  sheep.clone();
        Sheep sheep2 = sheep.clone();
        Sheep sheep3 = sheep.clone();
        Sheep sheep4 = sheep.clone();

        System.out.println(sheep);
        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep.friend == sheep1.friend);



    }
}
