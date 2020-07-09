package com.atxzy.prototype.deepClone;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepPrototype p = new DeepPrototype();
        p.deepCloneableTarget = new DeepCloneableTarget("大牛","小牛类");
//        DeepPrototype p1 = p.clone();
//        System.out.println(p);
//        System.out.println(p1);
//        System.out.println(p.deepCloneableTarget == p1.deepCloneableTarget);

        //方式二  完成深拷贝

        DeepPrototype p1 = p.deepClone();
        System.out.println(p);
        System.out.println(p1);
        System.out.println(p.deepCloneableTarget == p1.deepCloneableTarget);
    }
}
