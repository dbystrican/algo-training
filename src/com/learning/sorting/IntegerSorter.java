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
            for (int i = from + 1; i <= to; i++) {
                if (numbersArray[i] < numbersArray[from]) {
                    swap(numbersArray, ++divisionIndex, i);
                }
            }
            swap(numbersArray, from, divisionIndex);
            quickSort(numbersArray, from, divisionIndex - 1);
            quickSort(numbersArray, divisionIndex + 1, to);
        }
        return numbersArray;
    }

    public static int[] cocktailSort(int[] numbersArray, int from, int to) {
        int left = from + 1;
        int right = to;
        int change = 0;
        do {
            for (int j = left; j <= right; j++) {
                if (numbersArray[j - 1] > numbersArray[j]) {
                    swap(numbersArray, j - 1, j);
                    change = j;
                }
            }
            right = change - 1;
            for (int j = right; j >= left; j--) {
                if (numbersArray[j - 1] > numbersArray[j]) {
                    swap(numbersArray, j - 1, j);
                    change = j;
                }
            }
            left = change + 1;
        } while (left <= right);
        return numbersArray;
    }

    public static int[] mergeSort(int[] numbersArray, int from, int to) {
        if (from < to) {
            int mid = (to + from) / 2;
            mergeSort(numbersArray, from, mid);
            mergeSort(numbersArray, mid + 1, to);
            mergeSorted(numbersArray, from, mid, to);
        }

        return numbersArray;
    }

    public static int[] mergeSorted(int[] numbersArray, int from, int mid, int to) {
        int[] tempArr = new int[to - from + 1];
        int tempArrPointer = 0;
        int leftPointer = from, rightPointer = mid + 1;
        while (leftPointer <= mid && rightPointer <= to) {
            if (numbersArray[leftPointer] < numbersArray[rightPointer]) {
                tempArr[tempArrPointer] = numbersArray[leftPointer];
                leftPointer++;
            } else {
                tempArr[tempArrPointer] = numbersArray[rightPointer];
                rightPointer++;
            }
            tempArrPointer++;
        }
        while (leftPointer <= mid) {
            tempArr[tempArrPointer] = numbersArray[leftPointer];
            leftPointer++;
            tempArrPointer++;
        }
        while (rightPointer <= to) {
            tempArr[tempArrPointer] = numbersArray[rightPointer];
            rightPointer++;
            tempArrPointer++;
        }


        for (int i = from; i <= to; i++) {
            numbersArray[i] = tempArr[i - from];
        }
        return numbersArray;
    }


    private static void swap(int[] numbersArray, int num1Index, int num2Index) {
        int temp = numbersArray[num1Index];
        numbersArray[num1Index] = numbersArray[num2Index];
        numbersArray[num2Index] = temp;
    }
}
