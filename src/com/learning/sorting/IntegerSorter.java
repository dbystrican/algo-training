package com.learning.sorting;

import org.jetbrains.annotations.Contract;

public class IntegerSorter {

    public static int[] bubbleSort(int[] numbersArray, int from, int to) {
        for (int i = from; i < to; i++) {
            for (int j = 1; j < to - i; j++) {
                if (numbersArray[j - 1] > numbersArray[j]) {
                    numbersArray = IntegerSorter.swap(numbersArray, j - 1, j);
                }
            }
        }
        return numbersArray;
    }

    public static int[] insertionSort(int[] numbersArray, int from, int to) {
        for (int i = from + 1; i < to; i++) {
            int keyValue = numbersArray[i];
            int j = i;
            while (j > i && numbersArray[j] > keyValue) {
                numbersArray[j] = numbersArray[j - 1];
                j--;
            }
            numbersArray[j] = keyValue;
        }
        return numbersArray;
    }

    private static int[] swap(int[] numbersArray, int num1Index, int num2Index) {
        int temp = numbersArray[num1Index];
        numbersArray[num1Index] = numbersArray[num2Index];
        numbersArray[num2Index] = temp;
        return numbersArray;
    }
}