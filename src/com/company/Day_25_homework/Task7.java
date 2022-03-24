package com.company.Day_25_homework;
//7. Given a string, compute recursively a new string where all the 'x' chars
//have been removed.

public class Task7 {
    public static String removeFromString(String str){
        if (str.length()==0){
            return "";
        }
        if (str.charAt(0) != 'x'){
            return str.charAt(0) + removeFromString(str.substring(1));
        }
        return removeFromString(str.substring(1));
    }
}
