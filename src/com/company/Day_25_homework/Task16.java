package com.company.Day_25_homework;

public class Task16 {
    public static String mirroredString(String str) {
        if (str.length() == 0) {
            return "";
        }

        return str.charAt(0) + mirroredString(str.substring(1)) +
                ((str.charAt(0) == '(') ? ")" : str.charAt(0));

    }
}
