package com.company.Day_25_homework;
//9.Given a string, compute recursively a new string where all the
// lowercase 'x' chars have been moved to the end of the string.
//Example`
//endX("xxre") → "rexx"
//endX("xxhixx") → "hixxxx"

public class Task9 {
    public static String endX(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.charAt(0) != 'x') {
            return str.charAt(0) + endX(str.substring(1));
        }
        return endX(str.substring(1))+str.charAt(0);

    }
}
