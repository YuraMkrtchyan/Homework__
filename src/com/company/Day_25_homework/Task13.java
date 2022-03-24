package com.company.Day_25_homework;

//13.You are given a string containing numbers and English letters
//(uppercase and lowercase). Find and display the number of digits.

public class Task13 {
    public static int numOfDigits(String str) {
        int count = 0;
        if (str.length() == 0) {
            return count;
        }
        if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
            count++;
        }
        return count + numOfDigits(str.substring(1));
    }
}
