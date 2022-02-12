package com.company.Day_9_homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        stringVariables(sc.nextLine(), sc.nextLine());

//        stringInit();

//        Positive_or_Negative_or_0(sc.nextInt());

//        mathMaxAndAbs();

//        stringCheck();

//        maxOfThree(sc.nextInt(),sc.nextInt(),sc.nextInt());


        // 9
//        System.out.println("What is the correct way to declare a variable to store an integer value in Java?");
//        System.out.println("a. int 1x=10");
//        System.out.println("b. int x=10");
//        System.out.println("c. float x=10.0f");
//        System.out.println("d. string x=10");
//        System.out.print("Enter your choice: ");
//        question(sc.nextLine());

        // 10.1
//        vowelOrConsonant(sc.nextLine());

        // 10.2
//        numberKeys(sc.nextLine());

        // 11
//        evenOrOdd(sc.nextInt());

        // 12
//        System.out.println("enter 2 float numbers and calculation operator");
//        calculator(sc.nextFloat(), sc.nextFloat(), sc.next());

        // 13
//        weekdayToNumber(sc.next());

        //14
//        System.out.println("input your quiz, mid-term, and final scores");
//        grade(sc.nextInt(), sc.nextInt(), sc.nextInt());

        sc.close();
    }

    /**
     * compare strings
     *
     * @param str1
     * @param str2
     */
    public static void stringVariables(String str1, String str2) {
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }

    /**
     * init and compare strings
     */
    public static void stringInit() {
        String str1 = "abc";
        String str2 = new String("abc");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }

    /**
     * positive or negative
     *
     * @param a
     */
    public static void Positive_or_Negative_or_0(int a) {
        System.out.println(a > 0 ? "positive" : "negative");
        System.out.println(a > 0 ? "positive" : (a < 0) ? "negative" : 0);
    }

    /**
     * max and abs by using ternar
     */
    public static void mathMaxAndAbs() {
        int a = -7;
        int b = 1;
        System.out.println(a > b ? a : b);
        System.out.println(a < 0 ? -a : a);
    }

    /**
     * checking string
     */
    public static void stringCheck() {
        String str = "";
        System.out.println(str == null ? -1 : str == " " ? 0 : 1);
    }

    /**
     * find max number
     *
     * @param a
     * @param b
     * @param c
     */
    public static void maxOfThree(int a, int b, int c) {
        int max = a > b ? a > c ? a : c : b > c ? b : c;
        System.out.println(max);
    }

    /**
     * 9 choose the correct answer
     *
     * @param choice
     */
    public static void question(String choice) {
        switch (choice) {
            case "a":
                System.out.println("Invalide choice");
                break;
            case "b":
                System.out.println("Congratulation");
                break;
            case "c":
                System.out.println("Invalide choice");
                break;
            case "d":
                System.out.println("Invalide choice");
                break;
            default:
                System.out.println("no such answer");
        }


    }

    /**
     * 10.1 vowel or consonant
     *
     * @param character
     */
    public static void vowelOrConsonant(String character) {
        switch (character) {
            case "a":
                System.out.println("a is  a Vowel");
                break;
            case "e":
                System.out.println("e is  a Vowel");
                break;
            case "i":
                System.out.println("i is  a Vowel");
                break;
            case "o":
                System.out.println("o is  a Vowel");
                break;
            case "u":
                System.out.println("u is  a Vowel");
                break;
            case "y":
                System.out.println("y is  a Vowel");
                break;
            default:
                System.out.println("the character is consonant");
        }
    }

    /**
     * 10.2 number or not a number
     *
     * @param character
     */
    public static void numberKeys(String character) {
        switch (character) {
            case "0":
                System.out.println("you entered 0");
                break;
            case "1":
                System.out.println("you entered 1");
                break;
            case "2":
                System.out.println("you entered 2");
                break;
            case "3":
                System.out.println("you entered 3");
                break;
            case "4":
                System.out.println("you entered 4");
                break;
            case "5":
                System.out.println("you entered 5");
                break;
            case "6":
                System.out.println("you entered 6");
                break;
            case "7":
                System.out.println("you entered 7");
                break;
            case "8":
                System.out.println("you entered 8");
                break;
            case "9":
                System.out.println("you entered 9");
                break;
            default:
                System.out.println("Not allowed");
        }
    }

    /**
     * 11 even or odd number, using ternary and switch
     *
     * @param x
     */
    public static void evenOrOdd(int x) {
        x = (x % 2 == 0) ? 0 : 1;
        switch (x) {
            case 0:
                System.out.println("even");
                break;
            case 1:
                System.out.println("odd");
                break;
        }
    }

    /**
     * 12 calculator
     *
     * @param a
     * @param b
     * @param character
     */
    public static void calculator(float a, float b, String character) {
        switch (character) {
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            default:
                System.out.println("incorrect operator");
        }


    }

    /**
     * 13 weekday
     *
     * @param dayName
     */
    public static void weekdayToNumber(String dayName) {
        switch (dayName.toLowerCase()) {
            case "sunday":
                System.out.println("1");
                break;
            case "monday":
                System.out.println("2");
                break;
            case "tuesday":
                System.out.println("3");
                break;
            case "wednesday":
                System.out.println("4");
                break;
            case "thursday":
                System.out.println("5");
                break;
            case "friday":
                System.out.println("6");
                break;
            case "saturday":
                System.out.println("7");
                break;
            default:
                System.out.println("wrong weekday");
        }


    }

    /**
     * 14 scores
     * @param quizScore
     * @param midTerm
     * @param finalScore
     */
    public static void grade(int quizScore, int midTerm, int finalScore) {
        if (quizScore < 0 || midTerm < 0 || finalScore < 0) {
            System.out.println("wrong inputs");
            return;
        }
        int averageScore = (quizScore + midTerm + finalScore) / 3;

        switch (averageScore / 20) {
            case 5:
            case 4:
                System.out.println("Your grade is A");
                break;
            case 3:
                System.out.println("Your grade is B");
                break;
            case 2:
                System.out.println("Your grade is C");
                break;
            case 1:
            case 0:
                System.out.println("Your grade is F");
                break;
            default:
                System.out.println("invalid inputs");
        }

    }

}