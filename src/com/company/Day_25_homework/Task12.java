package com.company.Day_25_homework;

//12.Given a string containing only decimal digits. Find and display the largest digit.
public class Task12 {
    public static int largestDigit(String str) {
        int max = 0;
        if (str.length() == 0) {
            return 0;
        }
        max = Integer.parseInt(String.valueOf(str.charAt(0)));
        max = Math.max(max, largestDigit(str.substring(1)));
        return max;
    }
}
