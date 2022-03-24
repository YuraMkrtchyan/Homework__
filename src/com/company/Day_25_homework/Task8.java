package com.company.Day_25_homework;
//8.Write recursive function that reverses the given String.
//Example` HELLO -> OLLEH

public class Task8 {
    public static String reverseString(String str) {
        if (str.length() == 0) {
            return "";
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
