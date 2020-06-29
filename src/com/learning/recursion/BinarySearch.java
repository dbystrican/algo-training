package com.learning.recursion;

public class BinarySearch {
    public static int recursiveSearch(int[] array, int searched, int from, int to) {
        int middle = (to + from) / 2;
        if(to < from) return -1;
        else if (array[middle] == searched) {
            return middle;
        } else if (searched > array[middle]) {
            return recursiveSearch(array, searched, middle + 1, to);
        } else {
            return recursiveSearch(array, searched, from, middle - 1);
        }
    }

    public static int iterativeSearch(int[] array, int searched, int from, int to) {
        while (to >= from) {
            int middle = (to + from) / 2;
            if (array[middle] == searched) {
                return middle;
            } else if (searched > array[middle]) {
                from = middle + 1;
            } else {
                to = middle - 1;
            }
        }
        return -1;
    }
}
