package com.learning.sorting;

import java.util.Random;

public class ArrayGenerator {

    public static int[] generateIntArray(int size, int min, int max) {
        Random random = new Random();
        int[] randomArray = new int[size];
        int range = max - min + 1;
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(range) + min;
        }
        return randomArray;
    }
}
