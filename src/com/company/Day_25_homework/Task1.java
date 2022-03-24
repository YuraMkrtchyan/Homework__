package com.company.Day_25_homework;

//1. Write a recursive function
//- to find the sum of a given array.
//- to find the factorial of a given natural N.

public class Task1 {
    private static int count = 0;
    private static int sum = 0;

    public static int sumOfArrayElem(int[] arr) {
        sum += arr[count++];
        if (count < arr.length) {
            sumOfArrayElem(arr);
        }
        return sum;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
