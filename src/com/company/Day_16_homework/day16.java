package com.company.Day_16_homework;

import java.util.Scanner;

public class day16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //3.1
//        System.out.println(powOfTwo(sc.nextInt()));

        //4
//        time(sc.nextInt());

        //5.1 How many times will the body of the loop be executed?
//       1) -	-       for (int i = 2; i <= 15; i ++)
//        {...}
//       2) -	-       for (int i = 10; i <= 100; i = i+7)
//        {...}
//       3) -	-       for (float i = 1.5; i <= 10.3; i = i+0.4)
//        {...}
        // 1) 14
        // 2) 13
        // 3) 23


        //5.2
//        System.out.println(isPrime(sc.nextInt()));

        //6
//        palindromeNumbersInRange(sc.nextInt(), sc.nextInt());

        //7
//        firstUpperCase(sc.nextLine());

        //8
//        checkerboard(sc.nextInt());

        //9
//        System.out.printf("%.2f", geometricProgression(sc.nextDouble(), sc.nextDouble(), sc.nextInt()));

        //10
//        primeFactory(sc.nextInt());

        //13
//        snake(sc.nextInt(), sc.nextInt());
    }

    /**
     * 3.1 A natural number N is given (entered from the keyboard). Calculate two to the power of N
     * Display the calculated value (1 <= N <= 15).
     */
    public static int powOfTwo(int n) {
        int a = 1;
        if (n < 1 || n > 15) {
            return -1;
        }
        for (int i = 1; i <= n; i++) {
            a *= 2;
        }
        return a;
    }

    /**
     * 4. Given number n. N minutes have passed since the beginning of the day.
     * Determine how many hours and minutes the digital clock will show at this moment.
     * The program should print two numbers: the number of hours (from 0 to 23) and the
     * number of minutes (from 0 to 59). Note that the number n can be more than the
     * number of minutes in a day.
     * <p>
     * Example` 150      2 30
     * 1441   0   1
     */
    public static void time(int n) {
        int hours = n / 60;
        if (hours > 23) {
            hours -= 24;
        }
        int minutes = n % 60;
        System.out.println(hours + ":" + minutes);
    }

    /**
     * 5.2 Write a java program to determine whether the number is prime or not.
     */
    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 6.You are given two four-digit numbers A and B. Print all four-digit numbers on the segment from A to B, the record of which is a palindrome.
     * Example` from 1600 to 2100
     * palindrome numbers are 1661 1771 1881 1991 2002
     */
    public static void palindromeNumbersInRange(int a, int b) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        //System.out.println(sb1.append(a).reverse());
        for (int i = a; i <= b; i++) {
            if (sb1.append(i).toString().equals(sb2.append(i).reverse().toString())) {
                System.out.println(sb1);
            } else {
                sb1.setLength(0);
                sb2.setLength(0);
            }
        }

    }

    /**
     * 7. A three-letter word is given. The word consists only of Latin letters,
     * small and large. Print the same word, where the first letter is capitalized, the rest are small.
     * <p>
     * Example` dog	Dog
     * CAT Cat
     * Lip Lip
     */
    public static void firstUpperCase(String str) {
        char[] ch = str.toCharArray();
        boolean b = true;
        for (char item : ch) {
            if (!((item >= 'a' && item <= 'z') || (item >= 'A' && item <= 'Z'))) {
                b = false;
                break;
            }
        }
        if (!b) {
            System.out.println("wrong input");
            return;
        }
        String str1 = str.substring(0, 1).toUpperCase();
        String str2 = str.substring(1).toLowerCase();
        System.out.println(str1 + str2);
    }

    /**
     * 8.Enter the number N and draw an NxN checkerboard where the top left is white.
     * Designate white margins O, black margins X. Use a for loop.
     * Input ` 3
     * Output` OXO
     * XOX
     * OXO
     */
    public static void checkerboard(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1)) {
                    System.out.print("O");
                } else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }

    /**
     * 9.The first term and the denominator of the geometric progression are given
     * (real numbers b1 and q, q! = 0). An integer n is also given.
     * Print the n-th term of a geometric progression. Don't use the pow function,
     * use a for loop. Print the answer with precision exactly two characters after the period.
     * Example` Input ` 2, 2, 5 -> 32.0
     * 3.2, 1.5, 4 -> 10.80
     *
     * @param a1
     * @param q
     * @param n
     * @return an
     */
    public static double geometricProgression(double a1, double q, int n) {
        double an = a1;   // a1 * q^(n-1);
        for (int i = 0; i < n - 1; i++) {
            an *= q;
        }
        return an;
    }

    /**
     * 10. A natural number >= 2 is specified. Expand it into prime factors.
     * Example` Input` 120  2*2*2*3*5
     *
     * @param n
     */
    public static void primeFactory(int n) {
        if (n < 2) {
            System.out.println("wrong input");
            return;
        }
        if (isPrime(n)) {
            System.out.println(n + " is prime number");
            return;
        }
        for (int i = 0; i < n / 2; i++) {
            for (int j = 2; j <= n; j++) {
                if (n % j == 0) {
                    n = n / j;
                    System.out.print(j);
                    if (n == 1) {
                        return;
                    }
                    System.out.print("*");
                    break;
                }
            }
        }
    }

    /**
     * 13.Given numbers n and m. Create an array A [n] [m] and fill it with a snake (see example).
     * Example` Input 4  10
     * Output `
     * 0  1  2  3  4  5  6  7  8  9
     * 19 18 17 16 15 14 13 12 11 10
     * 20 21 22 23 24 25 26 27 28 29
     * 39 38 37 36 35 34 33 32 31 30
     */
    public static void snake(int n, int m) {
        int[][] arr = new int[n][m];
        int currentJ = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = currentJ++;
                }
            } else {
                for (int j = arr[i].length - 1; j >= 0; j--) {
                    arr[i][j] = currentJ++;
                }
            }
        }
        for (int[] row : arr) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}
