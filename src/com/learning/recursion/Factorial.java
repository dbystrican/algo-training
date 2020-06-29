package com.learning.recursion;

public class Factorial {
    public static int recursiveFactorial(int num){
        if(num == 0) return 1;
        else return num * recursiveFactorial(num-1);
    }

    public static int iterativeFactorial(int num){
        int factorial = num;
        if(num == 0) return 1;
        for(int i = num -1; i>0;i--){
            num = num * i;
        }
        return num;
    }
}
