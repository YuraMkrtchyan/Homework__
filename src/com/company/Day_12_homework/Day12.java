package com.company.Day_12_homework;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1
//        evenIndexes(sc.nextInt());

        //2
//        evenItems(sc.nextInt());

        //3
//        System.out.println(numberOfPositiveElements());

        //4
//        elementsLargerThanPrevious();

        //5
//        adjacentElements();

        //6
//        largestElement();

        //7
//        smallestPositive();

        //8
//        System.out.println(differentElementsCount());

        //9
//        printElementsInReverse();

        //10
//        reverseArray();

        //11
//        rearrangeAdjacentElements();

        //12
//        cycleRight();

        //13
//        swapMinAndMax();

        //14
//        System.out.println("enter k index");
//        removeElementOfArray(sc.nextInt());

        //15
//        uniqueElements();

    }

    /**
     * method, that generates an array
     *
     * @return arr[]
     */
    public static int[] generateArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter array's length");
        int[] arr = new int[scanner.nextInt()];
        System.out.println("input elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        return arr;
    }


    /**
     * 1. Print all elements of the array with even indices
     *
     * @param n
     */
    public static void evenIndexes(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

    /**
     * 2. Print all even numbered items in the list.
     *
     * @param n
     */
    public static void evenItems(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

    /**
     * 3. Find the number of positive elements in the given array.
     *
     * @return count
     */
    public static int numberOfPositiveElements() {
        int[] arr = {1, -1, 2, 3, -8};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * 4. Print all the elements of the list that are larger than the previous element.
     */
    public static void elementsLargerThanPrevious() {
        int[] arr = generateArray();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] > arr[i]) {
                System.out.println(arr[i + 1]);
            }
        }
    }

    /**
     * 5. An array of numbers is given.
     * If it has two adjacent(հարևան) elements of the same sign, print these numbers.
     * If there are no adjacent elements of the same character, do not print anything.
     * If there are several such pairs of neighbors, print the first pair.
     */
    public static void adjacentElements() {
        int arr[] = generateArray();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] * arr[i + 1] > 0) {
                System.out.println(arr[i] + " " + arr[i + 1]);
                return;
            }
        }
    }

    /**
     * 6. An array of numbers is given. Print the value of the largest element
     * in the array, and then the index of that element in the array.
     * If there are several largest elements, print the index of the first of them.
     */
    public static void largestElement() {
        int arr[] = generateArray();
        int max = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println("max = " + max + "  index = " + index);
    }

    /**
     * 7. Print the value of the smallest of all positive elements in the list.
     * It is known that the list contains at least one positive element, and the
     * absolute value of all elements of the list does not exceed 1000.
     * Example ` Input ` 5  -4  3  -2  1
     * Output ` 1
     */
    public static void smallestPositive() {
        int[] arr = generateArray();
        int minPositive = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > 0) {
                minPositive = arr[i];
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] < minPositive) {
                minPositive = arr[i];
            }
        }
        System.out.println("smallest positive number is " + minPositive);
    }

    /**
     * 8.You are given a list sorted by non-decreasing elements in it.
     * Determine how many different elements are in it.
     * Example ` Input ` 1 2 2 3 3 3
     * Output ` 3
     */
    public static int differentElementsCount() {
        int[] arr = generateArray();
        int count = 1;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                count++;
            }
        }
        return count;
    }

    /**
     * 9. Print the elements of the given list in reverse
     * order without changing the list itself.
     * Example ` Input `  1 2 3 4 5
     * Output ` 5 4 3 2 1
     */
    public static void printElementsInReverse() {
        int[] arr = generateArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    /**
     * 10. Rearrange the elements of this array in reverse order,
     * then print the elements of the resulting array.
     */
    public static void reverseArray() {
        int[] arr = generateArray();
        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            array[array.length - i - 1] = arr[i];
        }
        for (int item : array) {
            System.out.println(item);
        }
    }

    /**
     * 11. Rearrange the adjacent elements of the array (A [0] with A [1], A [2] with A [3], etc.).
     * If there is an odd number of elements, then the last element remains in its place
     */
    public static void rearrangeAdjacentElements() {
        int[] arr = generateArray();
        int temp;
        int iter;
        if (arr.length % 2 == 0) {
            iter = arr.length - 1;
        } else {
            iter = arr.length - 2;
        }
        for (int i = 0; i < iter; i += 2) {
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        for (int item : arr) {
            System.out.println(item);
        }

    }

    /**
     * 12.Cycle the elements of the array to the right (A [0] goes to
     * A [1], A [1] to A [2], ...,
     * the last element goes to A [0]).
     * Example ` Input `  1 2 3 4 5
     * Output ` 5 1 2 3 4
     */
    public static void cycleRight() {
        int[] arr = generateArray();
        int[] array = new int[arr.length];
        for (int i = 1; i < array.length; i++) {
            array[i] = arr[i - 1];
        }
        array[0] = arr[arr.length - 1];
        for (int item : array) {
            System.out.println(item);
        }
    }

    /**
     * 13.In the list, all items are different. Swap the minimum and maximum elements of this list.
     * Example ` Input `  3 2 1 4 5
     * Output ` 3 2 5 4 1
     */
    public static void swapMinAndMax() {
        int[] arr = generateArray();
        int temp;
        int min = arr[0];
        int max = arr[0];
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
        }

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }

        temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;

        for (int item : arr) {
            System.out.println(item);
        }
    }

    /**
     * 14.You are given an array of numbers and the index of an element in the array.
     * Index is k. Remove the element with index k from the list by moving all elements
     * to the right of the element with index k to the left.
     * The program should shift directly in the array, and not do it when displaying elements.
     * Also, you cannot use an additional array.
     * At least decrement size of array, and print array;
     * Example` Input` 1 2 3 4 5  Output` 1 2 4 5
     * 2
     */
    public static void removeElementOfArray(int k) {
        int[] arr = generateArray();
        int temp;
        for (int i = k; i < arr.length - 1; i++) {
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
    }

    /**
     * 15.A list is given. Print those elements of it that appear in the list only once.
     * Items should be displayed in the order in which they appear in the list.
     * Example` Input  ` 1 2 2 3 3 3
     * Output ` 1
     */
    public static void uniqueElements() {
        int[] arr = generateArray();
        Arrays.sort(arr);
        int count;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 0 || count == 1) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}