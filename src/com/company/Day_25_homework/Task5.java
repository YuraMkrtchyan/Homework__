package com.company.Day_25_homework;

//5.Given a non-negative int n, return the count of the occurrences of 7
//as a digit, so for example 717 yields 2.
public class Task5 {
    public static int countOfSeven(int n) {
        int count = 0;
        if (n / 10 == 0) {
            if (n % 10 == 7) {
                return 1;
            }
            return 0;
        } else if (n % 10 == 7) {
            count++;
        }

        return countOfSeven(n / 10) + count;

    }
}
