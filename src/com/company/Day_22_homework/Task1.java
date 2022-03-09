package com.company.Day_22_homework;

import java.util.Scanner;

public class Task1 {
    //1. Write a method which will endlessly ask the user for
// the input(nextLine()), try to convert the input to the
// number(wrap it with the try catch block). If you can’t
// convert it, then ask user for another input. After
// successfully converting the input return the number.
// For converting use Integer.parseInt()
    public static void main(String[] args) {
        System.out.println(convert());
    }

    public static int convert() {
        Scanner scanner = new Scanner(System.in);
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("enter valid number");
        }
        return convert();
    }
}
