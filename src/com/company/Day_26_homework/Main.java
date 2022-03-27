package com.company.Day_26_homework;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1
//        List<Integer> list = new ArrayList<>(List.of(1, 2, 980, 3, -8758, 765));
//        print(list);

        //2
//        System.out.println(arrayAsList(new Integer[]{1, 2, 3}));

        //3
//        List<String> list1 = new ArrayList<>(List.of("f", "a", "k", "b"));
//        Comparator<String> comparator = new Comparator<>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        };
//        System.out.println(largestValue(list1, comparator));

        //4.
//         Define a method copy(dest, src) which will copy from src to dest.
//         src and dest are lists. (use wildcards for this problem)
//         Method should work for this example`
//         List<Number> nums;
//         List<Integer> ints;
//         copy(nums, ints);
//         But not for this` copy(ints, nums);


//        List<Number> nums = new ArrayList<>();
//        List<Integer> ints = new ArrayList<>(List.of(1, 2, 3, 4));
//        copy(nums, ints);
//        System.out.println(nums);
////        copy(ints, nums);

        Pair<String, Integer> pair = new DefaultPair<>("key", 5);
        Pair<String, Integer> pair1 = new DefaultPair<>("key1", 15);

        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
        System.out.println(pair1.getKey());
        System.out.println(pair1.getValue());

    }


    //1. Write a method which takes a list of any type and prints the elements of the list.
    public static <T> void print(List<T> list) {
        System.out.println(list);
    }


    //2. Write a method that takes an array of T type and converts it to a list of type T.
    public static <T> List<T> arrayAsList(T[] arr) {
        return new ArrayList<T>(List.of(arr));
    }


    // 3. Write a method which takes a List of T type and Comparator of type T.
// Return the largest value in the list
    public static <T> T largestValue(List<T> list, Comparator<T> comparator) {
        list.sort(comparator);
        return list.get(list.size() - 1);
    }

    //4
    public static <T> void copy(List<T> dest, List<? extends T> src) {
        dest.addAll(src);

//        for (T element : src) {
//            dest.add(element);
//        }
    }

}
