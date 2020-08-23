package com.learning.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        var arrayUnsorted = ArrayGenerator.generateIntArray(10, 0, 8);
        System.out.println("Unsorted randomly generated array is "
                + Arrays.toString(arrayUnsorted));
        System.out.println("Sorted randomly generated array with bubble sort is "
                + Arrays.toString(IntegerSorter.bubbleSort(arrayUnsorted.clone(), 0, arrayUnsorted.length )));
        System.out.println("Sorted randomly generated array with insertion sort is "
                + Arrays.toString(IntegerSorter.insertionSort(arrayUnsorted.clone(), 0, arrayUnsorted.length -1)));
        System.out.println("Sorted randomly generated array with quick sort is "
                + Arrays.toString(IntegerSorter.quickSort(arrayUnsorted.clone(), 0, arrayUnsorted.length -1)));
    }
}
