package com.company.Day_24_homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//1. Write a method which will check if given array of integers contains duplicate element.
public class Task1 {
//    public static boolean hasDuplicates(int[] arr) {
//        Set<Integer> set = new HashSet<>();
//        for (int num : arr) {
//            if (set.contains(num)) {
//                return true;
//            }
//            set.add(num);
//        }
//        return false;
//    }


    public static boolean hasDuplicates(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                return true;
            }
            map.put(i, 0);
        }
        return false;
    }
}
