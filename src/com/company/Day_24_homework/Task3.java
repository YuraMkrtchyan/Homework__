package com.company.Day_24_homework;

import java.util.HashMap;
import java.util.Map;

//3. Write a method that counts duplicate characters from a given string.
public class Task3 {
    public static int countDuplicates(String str) {
        int count = 0;
        char[] arr = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : arr) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1){
                count++;
            }
        }
        return count;
    }
}

