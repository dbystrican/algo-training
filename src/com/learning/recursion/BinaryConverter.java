package com.learning.recursion;

public class BinaryConverter {
    public static String toBinary(int num) {
        Integer division = num / 2;
        Integer remainder = num % 2;
        if (division > 0) return toBinary(division) + remainder.toString();
        else return remainder.toString();
    }

    public static String toBinaryOptimized(int num, String bin) {
        Integer division = num / 2;
        bin = String.valueOf(num % 2) + bin;
        if (division > 0) return toBinaryOptimized(division, bin);
        else return bin;
    }
}
