package com.learning.sorting;

public class IntegerSorter {

    public static int[] bubbleSort(int[] numbersArray, int from, int to) {
        for (int i = from; i <= to; i++) {
            for (int j = 1; j < to - i; j++) {
                if (numbersArray[j - 1] > numbersArray[j]) {
                    swap(numbersArray, j - 1, j);
                }
            }
        }
        return numbersArray;
    }

    public static int[] insertionSort(int[] numbersArray, int from, int to) {
        for (int i = from; i < to; i++) {
            int j = i + 1;
            int keyValue = numbersArray[j];
            while (j > 0 && numbersArray[j - 1] > keyValue) {
                numbersArray[j] = numbersArray[j - 1];
                j--;
            }
            numbersArray[j] = keyValue;
        }
        return numbersArray;
    }

    public static int[] quickSort(int[] numbersArray, int from, int to) {
        if (from < to) {
            int divisionIndex = from;
            for (int i = from + 1; i <= to ; i++) {
                if (numbersArray[i] < numbersArray[from]) {
                    swap(numbersArray, ++divisionIndex, i);
                }
            }
            swap(numbersArray, from, divisionIndex);
            quickSort(numbersArray, from, divisionIndex -1);
            quickSort(numbersArray, divisionIndex + 1, to);
        }
        return numbersArray;
    }

    public static int[] coctailSort() {

        return new int[0];
    }

    private static void swap(int[] numbersArray, int num1Index, int num2Index) {
        int temp = numbersArray[num1Index];
        numbersArray[num1Index] = numbersArray[num2Index];
        numbersArray[num2Index] = temp;
    }
}
