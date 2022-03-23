package com.company.Day_24_homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//2. Write a method which prints elements that occurred only once in the array.
public class Task2 {
    public static void printNotDuplicateElements(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        System.out.println(set);


//        Map<Integer, Integer> numFreq = new HashMap<>();
//        for (int num : arr) {
//            numFreq.put(num, numFreq.getOrDefault(num, 0) + 1);
//        }
//        for (Map.Entry<Integer, Integer> entry : numFreq.entrySet()) {
//            if (entry.getValue() == 1) {
//                System.out.println(entry.getKey());
//            }
//        }
    }
}
