package com.atxzy.strategy;

public class Dog implements Comparable<Dog>{

    int foodAmound;


    public Dog(int foodAmound) {
        this.foodAmound = foodAmound;
    }

    @Override
    public int compareTo(Dog obj) {
        Dog d = (Dog)obj;
        if(this.foodAmound<d.foodAmound){
            return -1;
        }else if(this.foodAmound > d.foodAmound){
            return 1;
        }else{
            return 0;
        }


    }

    @Override
    public String toString() {
        return "Dog{" +
                "foodAmound=" + foodAmound +
                '}';
    }
}
