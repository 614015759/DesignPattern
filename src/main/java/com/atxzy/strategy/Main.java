package com.atxzy.strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Comparable[] a = {new Cat(3,3),new Cat(5,5),new Cat(1,1)};
        Comparable[] d = {new Dog(7),new Dog(5),new Dog(9)};

        QuickSorter quickSorter = new QuickSorter();

//        quickSorter.quickSortObj2(a,new CatWeightComparator());
        quickSorter.quickSortObj2(a,new CatHeightComparator());
        Comparable[] dogs = quickSorter.quickSortObj(d);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(dogs));
    }


}
