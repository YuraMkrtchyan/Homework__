package com.company.Day_25_homework;

public class Task2 {
    int fib(int n){
        if(n <= 1){
            return n;
        }
        return fib(n-2) + fib(n-1);
    }
}
