package com.atxzy.strategy;

public class QuickSorter<T> {

    public QuickSorter() {
    }

    public  static int[] quickSort(int[] arrays){
        for(int i = 0 ; i < arrays.length ; i++){
            int point = arrays[i];
            int prePoint = i-1;
            while(prePoint >= 0 && point < arrays[prePoint]){
                arrays[prePoint+1] = arrays[prePoint];
                prePoint--;
            }
            arrays[prePoint + 1 ] = point;
        }
        return arrays;
    }

    public  Comparable[] quickSortObj(Comparable[] comparables){
        for(int i = 0 ; i < comparables.length ; i++){
            Comparable point = comparables[i];
            int prePoint = i-1;
            while(prePoint >= 0 && point.compareTo(comparables[prePoint]) < 0){
                comparables[prePoint+1] = comparables[prePoint];
                prePoint--;
            }
            comparables[prePoint + 1 ] = point;
        }
        return comparables;
    }

    public  void quickSortObj2(T[] arrs, Comparator<T> comparator){
        for(int i = 0 ; i < arrs.length ; i++){
            T point = arrs[i];
            int prePoint = i-1;
            while(prePoint >= 0 && comparator.compare(point,arrs[prePoint]) < 0){
                arrs[prePoint+1] = arrs[prePoint];
                prePoint--;
            }
            arrs[prePoint + 1 ] = point;
        }
        return ;
    }
}
