package com.atxzy.prototype.improve;

public class Sheep implements Cloneable{
    
    private String name;
    private int age;
    private String color;
    private String address = "蒙古羊";
    public Sheep friend;//朋友是个对象

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    //克隆该实例，使用默认的克隆方法来完成
    @Override
    protected Sheep clone()  {
        Sheep sheep = null;
        try {
           sheep = (Sheep) super.clone();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return sheep;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", address='" + address + '\'' +
                ", friend=" + friend +
                '}';
    }
}
