package com.company.Day_24_homework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//4. Write a method that returns the first non-repeated character from a given string.
public class Task4 {
    public static Character firstNonRepeatedChar(String str) {
        char[] arr = str.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : arr) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null;
    }
}



