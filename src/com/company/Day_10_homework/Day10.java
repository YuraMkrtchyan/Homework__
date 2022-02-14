package com.company.Day_10_homework;

import java.util.Random;
import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1
//        from1To10();

        //2
//        oddNumbers();

        //3
//        NaturalNumbersSquare(sc.nextInt());

        //4
//        smallestDivisor(sc.nextInt());

        //5
//        powerOfTwo(sc.nextInt());

        //6
//        inDescendingOrder(sc.nextInt());

        //7
//        multipleOf2(sc.nextInt());

        //8
//        exactPowerOfTwo();

        //9
//        mathPower(sc.nextInt());

        //10
//        asciiCode();

        //11
//        notMultipleOfThree(sc.nextInt());

        //12
//        fibonacciNumber(sc.nextInt());

        //13
//        athlete(sc.nextDouble(), sc.nextDouble());

        //14
//        deposit(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        //15
//        System.out.println(sequenceOfNumbers());

        //16
//        randomNumber();

        //17
//        System.out.println(sumOfDigits(sc.nextInt()));

    }

    /**
     * 1. integer numbers from 1 to 10
     */
    public static void from1To10() {
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
    }

    /**
     * 2. odd numbers in 1..20 range
     */
    public static void oddNumbers() {
        int i = 1;
        while (i <= 20) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
            i++;
        }
    }

    /**
     * 3. squares of natural numbers
     *
     * @param n
     */
    public static void NaturalNumbersSquare(int n) {
        int i = 1;
        while (i * i < n) {
            System.out.println(i * i);
            i++;
        }
    }

    /**
     * 4. smallest natural divisor
     *
     * @param n
     */
    public static void smallestDivisor(int n) {
        int i = 2;
        boolean b = false;
        while (i <= (n / 2)) {
            if (n % i == 0) {
                System.out.println(i);
                b = true;
                break;
            }
            i++;
        }
        if (!b) {
            System.out.println("n is a prime number");
        }
    }

    /**
     * 5. power of two
     *
     * @param n
     */
    public static void powerOfTwo(int n) {
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i = 2 * i;
        }
    }

    /**
     * 6. numbers in descending order
     *
     * @param n
     */
    public static void inDescendingOrder(int n) {
        while (n >= 0) {
            System.out.println(n);
            n--;
        }
    }

    /**
     * 7. multiple of two in descending order
     *
     * @param n
     */
    public static void multipleOf2(int n) {
        while (n >= 2) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
            n--;
        }


    }

    /**
     * 8. exact power of two
     */
    public static void exactPowerOfTwo() {
        Scanner scanner = new Scanner(System.in);
        int a, count = 0;
        while (true) {
            a = scanner.nextInt();
            if ((a & --a) != 0) {
                count++;
            } else {
                System.out.println(++a);
                System.out.println(++count);
                break;
            }
        }
    }

    /**
     * 9. smallest integer k, that Math.pow(2,k)≥n
     *
     * @param n
     */
    public static void mathPower(int n) {
        int k = 0;
        int num = 1;
        while (num < n) {
            num *= 2;
            k++;
        }
        System.out.println(num);
    }

    /**
     * 10. Ascii
     */
    public static void asciiCode() {
        char a = 32;
        int b = 0;
        while (a <= 122) {
            if (b == 10) {
                System.out.println();
                b = 0;
            }
            System.out.print(a + " ");
            a++;
            b++;
        }
    }

    /**
     * 11. not multiple of three
     *
     * @param n
     */
    public static void notMultipleOfThree(int n) {
        int i = 1;
        while (i <= n) {
            if (i % 3 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    /**
     * 12. fibonacci numbers
     *
     * @param a
     */
    public static void fibonacciNumber(int a) {
        int n1 = 1;
        int n2 = 1;
        int n = n1 + n2;
        int count = 3;
        while (n <= a) {
            n1 = n2;
            n2 = n;
            n = n1 + n2;
            count++;
            if (n == a) {
                System.out.println(count);
                break;
            }
        }
        if (n != a) {
            System.out.println(-1);
        }
    }

    /**
     * 13. athlete
     *
     * @param x
     * @param y
     */
    public static void athlete(double x, double y) {
        int days = 0;
        while (x <= y) {
            x *= 1.1;
            days++;
        }
        System.out.println(days);
    }

    /**
     * 14. deposit
     *
     * @param x
     * @param p
     * @param y
     */
    public static void deposit(double x, double p, double y) {
        int years = 0;
        while (x < y) {
            x *= 1 + p / 100;
            x = (int) x;
            years++;
        }
        System.out.println(years);
    }

    /**
     * 15. sequence
     *
     * @return
     */
    public static int sequenceOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        int first = 0, second = 0;
        int input = scanner.nextInt();
        while (input != 0) {
            if (input > first) {
                second = first;
                first = input;
            }
            input = scanner.nextInt();
        }
        return second;
    }

    /**
     * 16. random number
     */
    public static void randomNumber() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int guess;
        int rand = random.nextInt(100);
        while (true) {
            guess = scanner.nextInt();
            if (guess > rand) {
                System.out.println("Too high, try again");
            } else if (guess < rand) {
                System.out.println("Too low, try again");
            } else {
                System.out.println("Yes, you guessed the number");
                break;
            }
        }
    }

    /**
     * 17. sum of digits
     * @param number
     * @return
     */
    public static int sumOfDigits(int number) {
        int sum = 0;
        if(number < 0){
            number = Math.abs(number);
        }
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

}