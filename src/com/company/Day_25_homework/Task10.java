package com.company.Day_25_homework;
//10.Given a string, return recursively a "cleaned" string where adjacent
//chars that are the same have been reduced to a single char.
//Example`
//stringClean("yyzzza") → "yza"
//stringClean("abbbcdd") → "abcd"

public class Task10 {
    public static String nonRepeatingAdjacentElements(String str) {
        if (str.length() == 2) {
            if (str.charAt(0) == str.charAt(1)) {
                return "" + str.charAt(1);
            }
            return "" + str.charAt(0) + str.charAt(1);
        }

        if (str.charAt(0) == str.charAt(1)) {
            return nonRepeatingAdjacentElements(str.substring(1));
        }
        return str.charAt(0) + nonRepeatingAdjacentElements(str.substring(1));
    }
}
