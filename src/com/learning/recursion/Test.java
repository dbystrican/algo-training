package com.learning.recursion;

import com.learning.recursion.*;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        //first excercise for recursion
        int[] numberArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 10};
        System.out.println(Arrays.toString(numberArray));
        System.out.println(Arrays.toString(ArrayBackwards.recursiveReverseArray(numberArray, 0, numberArray.length - 1)));
        //second excercise for recursion
        numberArray = new int[]{0, 3, 8, 9, 10, 13, 14, 16, 18, 23, 25};
        for (int i = 0; i <= 26; i++) {
            int searched = i;
            System.out.println("Looking for " + searched + " in array " + Arrays.toString(numberArray));
            System.out.println("Found iteratively at " + BinarySearch.iterativeSearch(numberArray, searched, 0, numberArray.length - 1));
            System.out.println("Found recursively at " + BinarySearch.recursiveSearch(numberArray, searched, 0, numberArray.length - 1));
        }
        //third exercie
        int num1 = 25;
        System.out.println("Binary value of "+num1+" is "+ BinaryConverter.toBinary(num1)+" with direct recursion");
        System.out.println("Binary value of "+num1+" is "+ BinaryConverter.toBinaryOptimized(num1,"")+" with recursion with helping parameter");
        //Forth exercise
        new TriangleCarpetFrame();
        //fifth exercise
        System.out.println("Greatest common divisor of "+36+" and "+ 12+ " is " + EuclidGreaterCommonDivisor.greatestCommonDivisor(36,12));
        System.out.println("Greatest common divisor of "+10+" and "+ 4+ " is " + EuclidGreaterCommonDivisor.greatestCommonDivisor(10,4));
        System.out.println("Greatest common divisor of "+13+" and "+ 7+ " is " + EuclidGreaterCommonDivisor.greatestCommonDivisor(13,7));
        //sixt exercise
        int num2 = 2;
        System.out.println("recursive factorial of "+num2 +" is "+ Factorial.recursiveFactorial(num2));
        System.out.println("iterative factorial of "+num2 +" is "+ Factorial.iterativeFactorial(num2));
    }
}
