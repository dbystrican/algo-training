package com.learning.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var arrayUnsorted = ArrayGenerator.generateIntArray(10, 0, 8);
        System.out.println("Unsorted ramdomly generated array is "
                + Arrays.toString(arrayUnsorted));
        System.out.println("Sorted ramdomly generated array with bubblesort is "
                + Arrays.toString(IntegerSorter.bubbleSort(arrayUnsorted, 0, arrayUnsorted.length)));
    }
}
