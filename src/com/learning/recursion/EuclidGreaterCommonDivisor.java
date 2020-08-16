package com.learning.recursion;

public class EuclidGreaterCommonDivisor {
    public static int greatestCommonDivisor(int num1, int num2) {
        int biggerNumber = num1 > num2 ? num1 : num2;
        int smallerNumber = num1 < num2 ? num1 : num2;
        if (smallerNumber != biggerNumber - smallerNumber){
            return greatestCommonDivisor(biggerNumber - smallerNumber, smallerNumber );
        }else return smallerNumber;
    }
}
