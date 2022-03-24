package com.company.Day_25_homework;

//11.Write a function to determine if a number is prime or not.
public class Task11 {
    public static boolean isPrime(int a) {
        int count = 2;
        return helper(a, count);

    }
    public static boolean helper(int a, int count){
        if (count >= a/2){
            return true;
        }
        if (a % count == 0){
            return false;
        }
        return helper(a, ++count);

    }
}
