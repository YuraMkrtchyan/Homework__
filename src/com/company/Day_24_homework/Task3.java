package com.company.Day_24_homework;

import java.util.HashSet;
import java.util.Set;

//3. Write a method that counts duplicate characters from a given string.
public class Task3 {
    public static void countDuplicates(String str) {
        char[] arr = str.toCharArray();

        Set<Character> set = new HashSet<>();
        Set<Character> setDuplicates = new HashSet<>();
        for (char ch : arr) {
            set.add(ch);
        }
        for (char ch : arr) {
            if (set.contains(ch)) {
                setDuplicates.add(ch);
            }
        }
        System.out.println(setDuplicates.size());
    }
}

