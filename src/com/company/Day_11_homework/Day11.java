package com.company.Day_11_homework;

import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1
//        evenNumbersInRange(sc.nextInt(), sc.nextInt());

        //2
//        divideByD(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());

        //3
//        exactSquares(sc.nextInt(), sc.nextInt());

        //4
//        digitInNumber(sc.nextInt(), sc.nextInt());

        //5
//        reverseNumber(sc.nextInt());

        //6
//        smallestDivisor(sc.nextInt());

        //7
//        allDivisors(sc.nextInt());

        //8
//        naturalDivisors(sc.nextInt());

        //9
//        sumOfNumbers();

        //10
//        binToDecimal(sc.nextInt());

        //11
//        System.out.println("enter N");
//        nNumbers(sc.nextInt());

        //12
//        generator(sc.nextInt());

        //13
//        asterisk(sc.nextInt());

        //14
//        checkerboard(sc.nextInt());

        //15
//        multiplicationTable(sc.nextInt());

        //16
//        asteriskTriangle(sc.nextInt());
    }

    /**
     * 1. even numbers in range
     *
     * @param a
     * @param b
     */
    public static void evenNumbersInRange(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * 2. divide by d, reminder == c
     *
     * @param a
     * @param b
     * @param c
     * @param d
     */
    public static void divideByD(int a, int b, int c, int d) {
        for (int i = a; i <= b; i++) {
            if (i % d == c) {
                System.out.println(i + " ");
            }
        }
    }

    /**
     * 3. exact square
     */
    public static void exactSquares(int a, int b) {
        if (a >= b) {
            System.out.println("wrong input");
            return;
        }
        for (int i = a; i <= b; i++) {
            if (Math.sqrt(i) % 1 == 0) {
                System.out.println(i);
            }

        }
    }

    /**
     * 4. how many times the digit d occurs in the number
     *
     * @param x
     * @param d
     */
    public static void digitInNumber(int x, int d) {
        int count = 0;
        while (x > 0) {
            if (x % 10 == d) {
                count++;
            }
            x /= 10;
        }
        System.out.println(count);
    }

    /**
     * 5. reverse number
     *
     * @param x
     */
    public static void reverseNumber(int x) {
        int num = 0;
        while (x > 0) {
            if (x >= 10) {
                num = (num + x % 10) * 10;
            } else {
                num += x;
            }
            x /= 10;
        }
        System.out.println(num);
    }

    /**
     * 6. smallest divisor of x
     *
     * @param x
     */
    public static void smallestDivisor(int x) {
        for (int i = 2; i <= x; i++) {
            if (x % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }

    /**
     * 7. all divisors of x
     *
     * @param x
     */
    public static void allDivisors(int x) {
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * 8. count of natural divisors
     *
     * @param x
     */
    public static void naturalDivisors(int x) {
        int count = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    /**
     * 9. sum of 10 numbers
     */
    public static void sumOfNumbers() {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            sum += scanner.nextInt();
        }
        System.out.println(sum);
    }

    /**
     * 10. binary number to decimal
     *
     * @param x
     */
    public static void binToDecimal(int x) {
        int sum = 0;
        int count = 0;
        while (x >= 10) {
            if (x % 10 == 0 || x % 10 == 1) {
                sum += (x % 10) * Math.pow(2, count);
                x /= 10;
                count++;
            } else {
                System.out.println("wrong input");
                return;
            }
        }
        if (x != 0 || x != 1) {
            System.out.println("input is wrong");
            return;
        }
        sum += Math.pow(2, count);
        System.out.println(sum);
    }

    /**
     * 11. N numbers
     *
     * @param n
     */
    public static void nNumbers(int n) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input n numbers");
        int negative = 0;
        int positive = 0;
        int zero = 0;
        int number;
        for (int i = 0; i < n; i++) {
            number = scanner.nextInt();
            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println(zero + " zeros, " + positive + " positive, " + negative + " negative");
    }

    /**
     * 12. generator
     *
     * @param n
     */
    public static void generator(int n) {
        int count = 1;
        int number = 1;
        System.out.print(number + " ");
        while (true) {
            number++;
            for (int i = 0; i < number; i++) {
                System.out.print(number + " ");
                count++;
                if (count == n) {
                    return;
                }
            }
        }
    }

    /**
     * 13. N*N asterisks
     *
     * @param n
     */
    public static void asterisk(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * 14. checkerboard
     *
     * @param n
     */
    public static void checkerboard(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print(" #");
                }
            }
            System.out.println();
        }
    }

    /**
     * 15. multiplication table
     *
     * @param n
     */
    public static void multiplicationTable(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j * i + "\t");
            }
            System.out.println();
        }
    }

    /**
     * 16. triangles
     * @param n
     */
    public static void asteriskTriangle(int n) {
        System.out.println("\nA");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nB");
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("\nC");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println("\nD");
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= n; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
