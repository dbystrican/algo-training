package com.learning.recursion;

public class ArrayBackwards {
    public static int[] recursiveReverseArray(int [] array, int from, int to){
        if(from > to){
            return array;
        }else{
            int temp = array[from];
            array[from] = array[to];
            array[to] = temp;
            from++;
            to--;
            return recursiveReverseArray(array,from,to);
        }
    }
}
