package com.company.Day_25_homework;

//  "abca"
public class Task17 {
    public static String removeSymmetricalEqualElements(String str) {
        //if input string's length is even
        if (str.length() % 2 == 0) {

            if (str.length() / 2 == 0) {
                return "";
            }
            if (str.charAt(0) == str.charAt(str.length() - 1)) {
                return removeSymmetricalEqualElements(str.substring(1).substring(0, str.length() - 2));
            }
            return str.charAt(0) +
                    removeSymmetricalEqualElements(str.substring(1).substring(0, str.length() - 2)) +
                    str.charAt(str.length() - 1);
        }


        //if input string's length is odd
        if (str.length() / 2 == 0) {
            return str.charAt(str.length() / 2) + "";
        }
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return removeSymmetricalEqualElements(str.substring(1).substring(0, str.length() - 2));
        }
        return str.charAt(0) +
                removeSymmetricalEqualElements(str.substring(1).substring(0, str.length() - 2)) +
                str.charAt(str.length() - 1);
    }
}
