package com.company.Day_25_homework;
// 4. Given a non-negative int n, return the sum of its digits recursively (no
// loops).

public class Task4 {
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }

        return sumOfDigits(n / 10) + n%10;

    }
}
