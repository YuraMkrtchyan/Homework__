package com.company.Day_14_homework;

import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1
//        System.out.println(stringLength(sc.nextLine()));

        //2
//        System.out.println(character(sc.nextLine(), sc.nextInt()));

        //3
//        System.out.println(containsChar(sc.nextLine(), sc.next().charAt(0)));

        //4
//        System.out.println(vowels(sc.nextLine()));

        //5
//        System.out.print("Enter a String: ");
//        String str = sc.nextLine();
//        String str1 = reverseString(str);
//        System.out.println("The reverse of the String \"" + str + "\" is \"" + str1 + "\"");

        //6
//        countVowelsDigits(sc.nextLine());

        //7
//        caesarCode(sc.next().toUpperCase());

        //8
//        System.out.println(isPolindrome(sc.next().toLowerCase()));

        //9
//        System.out.print("Enter a binary string: ");
//        System.out.println(checkBinStr(sc.nextLine()));

        //10
//        System.out.println("Enter a hex string: ");
//        System.out.println(isHex(sc.nextLine().toLowerCase()));

        //11
//        System.out.println("Enter a Binary string: ");
//        bin2Dec(sc.nextLine());

        //12
//        System.out.println(duplicateChars(sc.nextLine()));

        //13
//        System.out.println(nonRepeat(sc.nextLine()));

        //14
//        System.out.println(occurrence(sc.nextLine(), 's'));
    }

    /**
     * 1. Write a function which returns the length of a given String.
     *
     * @param str
     * @return
     */
    public static int stringLength(String str) {
        return str.length();
    }

    /**
     * 2. Write a function which returns a character of a given index
     * from a given String. Pass as a parameters String str, int index
     *
     * @param str
     * @param index
     * @return
     */
    public static char character(String str, int index) {
        return str.charAt(index);
    }

    /**
     * 3. Write a function which checks if the given String contains
     * a given character.Pass as parameters String str, char ch
     *
     * @return
     */
    public static boolean containsChar(String str, char ch) {
        return str.contains(ch + " ");
        //hin tarberak
//        char[] arr = str.toCharArray();
//        for (char item : arr) {
//            if (item == ch) {
//                return true;
//            }
//        }
//        return false;
    }

    /**
     * 4. Write a function which returns the count of vowels of a given String
     *
     * @return
     */
    public static int vowels(String str) {
        int count = 0;
        char[] arr = str.toLowerCase().toCharArray();
        for (char item : arr) {
            if (item == 'a' || item == 'e' || item == 'i' || item == 'o' || item == 'u' || item == 'y') {
                count++;
            }
        }
        return count;
    }

    /**
     * 5. Write a function called reverseString, which prompts the user for a String, and prints
     * the reverse of the String by extracting and processing each character.
     * The output shall look like:
     * Enter a String: abcdef
     * The reverse of the String "abcdef" is "fedcba"
     *
     * @param str
     * @return
     */
    public static String reverseString(String str) {
        StringBuilder str1 = new StringBuilder();
        char[] arr = str.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            str1.append(arr[i]);
        }
        return str1.toString();
    }

    /**
     * 6. Write a program called countVowelsDigits, which get as parameter  a String,
     * counts the number of vowels (a, e, i, o, u, A, E, I, O, U) and digits (0-9)
     * contained in the string, and prints the counts and the percentages
     * (rounded to 2 decimal places).
     * For example`
     * Enter a String: testing12345
     * Number of vowels: 2 (16.67%)
     * Number of digits: 5 (41.67%)
     */
    public static void countVowelsDigits(String str) {
        int vowelsCount = vowels(str);
        int digitsCount = 0;
        char[] arr = str.toLowerCase().toCharArray();
        for (char item : arr) {
            if (Character.isDigit(item)) {
                digitsCount++;
            }
        }
        double vowelsPercent = (double) vowelsCount / arr.length * 100;
        double digitsPercent = (double) digitsCount / arr.length * 100;
        System.out.printf("Number of vowels: %d (%.2f%%)", vowelsCount, vowelsPercent);
        System.out.println();
        System.out.printf("Number of digits: %d (%.2f%%)", digitsCount, digitsPercent);
    }

    /**
     * 7. caesar code
     *
     * @param str
     */
    public static void caesarCode(String str) {
        char[] arr = str.toCharArray();
        for (char item : arr) {
            if (item >= 'A' && item <= 'W') {
                item += 3;
            }
            if (item == 'X') {
                item = 'A';
            }
            if (item == 'Y') {
                item = 'B';
            }
            if (item == 'Z') {
                item = 'C';
            }
            System.out.print(item);
        }


    }

    /**
     * 8. Write a function to check if the passed String palindrome or not
     * Print “xxx”  is|is not a Palindrome.
     * A word that reads the same backward as forward is called a palindrome,
     * e.g., "mom", "dad", "racecar", "madam", and "Radar" (case-insensitive).
     *
     * @param str
     * @return
     */
    public static boolean isPolindrome(String str) {
        String str1 = reverseString(str);
        return str1.equals(str);
    }

    /**
     * 9. The binary number system uses 2 symbols, 0 and 1.
     * Write a function called checkBinStr to verify a binary string.
     * The program shall prompt the user for a binary string; and decide
     * if the input string is a valid binary string. For example,
     * Enter a binary string: 10101100
     * "10101100" is a binary string
     * Enter a binary string: 10120000
     * "10120000" is NOT a binary string
     *
     * @param str
     * @return
     */
    public static boolean checkBinStr(String str) {
        char[] arr = str.toCharArray();
        for (char item : arr) {
            if (!(item == '1' || item == '0')) {
                return false;
            }
        }
        return true;
    }

    /**
     * 10. The hexadecimal (hex) number system uses 16 symbols, 0-9 and A-F (or a-f).
     * Write a program to verify a hex string. The function gets a hex string; and
     * decides if the input string is a valid hex string. For examples,
     * Enter a hex string: 123aBc
     * "123aBc" is a hex string
     * Enter a hex string: 123aBcx
     * "123aBcx" is NOT a hex string
     *
     * @param str
     * @return
     */
    public static boolean isHex(String str) {
        char[] arr = str.toCharArray();
        for (char item : arr) {
            if (!((item >= '0' && item <= '9') || (item >= 'a' && item <= 'f'))) {
                return false;
            }
        }
        return true;
    }

    /**
     * 11.Write a function called bin2Dec to convert an input
     * binary string into its equivalent decimal number.
     * Your output shall look like:
     * Enter a Binary string: 1011
     * The equivalent decimal number for binary "1011" is: 11
     * Enter a Binary string: 1234
     * error: invalid binary string "1234"
     *
     * @param str
     * @return
     */
    public static void bin2Dec(String str) {
        int inDecimal = 0;
        char[] arr = reverseString(str).toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '1') {
                inDecimal += Math.pow(2, i);
            } else if (arr[i] == '0') {
                continue;
            } else {
                System.out.println("error: invalid binary string " + "\"" + str + "\"");
                return;
            }
        }
        System.out.println("The equivalent decimal number for binary " +
                "\"" + str + "\" is: " + inDecimal);
    }

    /**
     * 12. Write a function that counts duplicate characters from a given string.
     *
     * @param str
     * @return
     */
    public static int duplicateChars(String str) {
        int count = 0;
        char ch;
        // dasaxos

        StringBuilder sb = new StringBuilder(str);

        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    ch = arr[i];
                    sb.deleteCharAt(j);
                    sb.append(" ");
                }
            }

        }


        return count;
    }

    /**
     * 13. Write a function that returns the first non-repeated character from a given string
     */
    public static char nonRepeat(String str) {

        char[] arr = str.toCharArray();
        char ch = str.charAt(0);
        boolean b;
        for (int i = 0; i < arr.length; i++) {
            b = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    b = false;
                    break;
                }
            }
            if (b) {
                ch = str.charAt(i);
                break;
            }
        }
        return ch;
    }

    /**
     * 14. Write a function that counts occurrences of a certain character in a given string.
     *
     * @param str
     * @param ch
     * @return count
     */
    public static int occurrence(String str, char ch) {
        int count = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) {
                count++;
            }
        }
        return count;
    }
}







