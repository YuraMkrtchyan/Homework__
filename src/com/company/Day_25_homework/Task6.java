package com.company.Day_25_homework;
//6.Given a string, compute recursively (no loops) the number
// of lowercase 'x' chars in the string.
//        Example`
//        countX("xxhixx") → 4
//        countX("xhixhix") → 3
//        countX("hi") → 0

public class Task6 {
    public static int countOfX(String str) {
        if(str.length() == 0){
            return 0;
        }
        if (str.charAt(0) == 'x') {
            return 1 + countOfX(str.substring(1));
        }
        return countOfX(str.substring(1));
    }
}
