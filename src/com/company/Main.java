package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();


        //1
//        System.out.println("input the age");
//        isEligible(sc.nextInt());

        //2
//        System.out.println("input the number (Even or odd?)");
//        isEven(sc.nextInt());

        //3
//        System.out.println();
//        rand(random.nextInt());

        //4
//        System.out.println("input number (is multiple of 5?)");
//        multiple_of_5(sc.nextInt());

        //5
//        System.out.println("enter 3 numbers (greatest)");
//        greatestNumber(sc.nextInt(), sc.nextInt(), sc.nextInt() );

        //6
//        System.out.println("enter float number");
//        floatNumber(sc.nextFloat());

        //7
//        System.out.println("input number from 1 to 7");
//        weekday(sc.nextInt());

        //8
//        System.out.println("input number");
//        iceCream(sc.nextInt());

        //9
//        System.out.print("enter year: ");
//        leapYear(sc.nextInt());

        //8. 1
//        System.out.println("Generating random number");
//        randomNum(random.nextInt());

        //9. 1
//        System.out.println("enter 2 numbers");
//        legal(sc.nextInt(), sc.nextInt());

        //10
//        System.out.println("enter 2 numbers");
//        printOddOrEvenNumbers(sc.nextInt(), sc.nextInt());

        //11
//        System.out.println("enter 4 coordinates");
//        coordinatePlane(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());

        //12
//        System.out.println("triangle's sides");
//        triangle(sc.nextInt(), sc.nextInt(), sc.nextInt());

        //13
//        System.out.println("enter 3 numbers");
//        countOfEqualNumbers(sc.nextInt(), sc.nextInt(), sc.nextInt());

        //14
//        System.out.println("find decisions");
//        decisions(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        //15
//        System.out.println("input 3 numbers");
//        nonDecreasingOrder(sc.nextInt(), sc.nextInt(), sc.nextInt());
    }

    /**
     * 1.
     * is person eligible to vete?
     *
     * @param age
     */
    public static void isEligible(int age) {
        if (age >= 18) {
            System.out.println("the person is eligible to vote");
        } else {
            System.out.println("the person isn't eligible to vote");
        }
    }

    /**
     * 2. is number even?
     *
     * @param num
     */
    public static void isEven(int num) {
        if (num % 2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
    }


    /**
     * 3. random number from 2 to 5
     *
     * @param a
     */
    public static void rand(int a) {
        System.out.println(Math.abs(a %= 6) + 2);
    }

    /**
     * 4. is multiple of 5?
     *
     * @param num
     */
    public static void multiple_of_5(int num) {
        if (num % 5 == 0) {
            System.out.println("is multiple of 5");
        } else {
            System.out.println("isn't multiple of 5");
        }
    }

    /**
     * 5. greatest of three numbers
     *
     * @param a
     * @param b
     * @param c
     */
    public static void greatestNumber(int a, int b, int c) {
        int max;
        if (a >= b) {
            max = a;
        } else if (b >= c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println(max);
    }

    /**
     * 6. float number
     *
     * @param f
     */
    public static void floatNumber(float f) {
        if (f == 0) {
            System.out.print("zero ");
        } else if (f > 0) {
            System.out.print("positive ");
        } else {
            System.out.print("negative ");
        }

        if (Math.abs(f) < 1) {
            System.out.println("small");
        }
        if (Math.abs(f) > 1_000_000) {
            System.out.println("large");
        }
    }

    /**
     * 7. days of the week
     *
     * @param a
     */
    public static void weekday(int a) {
        if (a == 1) {
            System.out.println("Sunday");
        } else if (a == 2) {
            System.out.println("Monday");
        } else if (a == 3) {
            System.out.println("Tuesday");
        } else if (a == 4) {
            System.out.println("Wednesday");
        } else if (a == 5) {
            System.out.println("Thursday");
        } else if (a == 6) {
            System.out.println("Friday");
        } else if (a == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("incorrect input");
        }
    }

    //8 -- ?????????

    /**
     * 8. ice-cream
     *
     * @param k
     */
    public static void iceCream(int k) {
        if (k < 3) {
            System.out.println("you can't buy ice-cream");
        } else if (k == 3 || k == 5) {
            System.out.println("you can buy ice-cream");
        } else if (k % 3 == 0 && k % 5 == 0) {
            System.out.println("you can buy");
        } else {
            System.out.println("you can't buy");
        }
    }

    /**
     * 9. leap year
     *
     * @param year
     */
    public static void leapYear(int year) {
        if (year % 4 != 0) {
            System.out.println("Not a leap year");
        } else if (year % 100 != 0) {
            System.out.println("Not a leap year");
        } else if (year % 400 != 0) {
            System.out.println("Not a leap year");
        } else {
            System.out.println("leap year");
        }
    }

    /**
     * 8.1 random
     *
     * @param randomNumber
     */
    public static void randomNum(int randomNumber) {
        boolean b = true;
        System.out.println(randomNumber);

        //8-i arajin ket
        if (randomNumber > -2_000_000_000 && randomNumber < 2_000_000_000) {
            System.out.println(b);
        } else {
            System.out.println(!b);
        }

        //8-i erkrord ket
        if (randomNumber % 3 == 0 || randomNumber % 5 == 0) {
            System.out.println(b);
        } else {
            System.out.println(!b);
        }
    }

    /**
     * 9.1 legal or illegal
     *
     * @param a
     * @param b
     */
    public static void legal(int a, int b) {
//        System.out.println("first task");
//        if(a > 10 && b!= 10){
//            System.out.println("Both a and b legal");
//        }else if(a > 10 && b == 10){
//            System.out.println("a is legal b is illegal");
//        } else if (a<=10 && b!=10){
//            System.out.println("a is illegal b is legal");
//        } else{
//            System.out.println("both illegal");
//        }

//        System.out.println("second task");
//        if(a > 0 && b > 0){
//            System.out.println("Both a and b legal");
//        }else if(a > 0 && b < 0){
//            System.out.println("a is legal b is illegal");
//        } else if (a < 0 && b > 0){
//            System.out.println("a is illegal b is legal");
//        } else{
//            System.out.println("both illegal");
//        }

//         System.out.println("third task");
//        if(a < 0 && b < 0){
//            System.out.println("Both a and b legal");
//        }else if(a < 0 && b > 0){
//            System.out.println("a is legal b is illegal");
//        } else if (a > 0 && b < 0){
//            System.out.println("a is illegal b is legal");
//        } else{
//            System.out.println("both illegal");
//        }

//        System.out.println("fourth task");
//        if (a > 10 && a % 2 == 1) {
//            if (b < 1 && b % 2 == 1) {
//                System.out.println("Both a and b legal");
//            } else {
//                System.out.println("a is legal b is illegal");
//            }
//        } else if (b < 1 && b % 2 == 1) {
//            System.out.println("a is illegal b is legal");
//        } else {
//            System.out.println("both illegal");
//        }

//        System.out.println("fifth task");
//        if (a % 5 == 0 && b % 5 == 0) {
//            System.out.println("Both a and b legal");
//        } else if (a % 5 == 0 && b % 5 != 0) {
//            System.out.println("a is legal b is illegal");
//        } else if (a % 5 != 0 && b % 5 == 0) {
//            System.out.println("a is illegal b is legal");
//        } else {
//            System.out.println("both illegal");
//        }

//        System.out.println("sixth task");
//        if (a % 5 != 0 && b % 5 == 0) {
//            System.out.println("Both a and b legal");
//        } else if (a % 5 != 0 && b % 5 != 0) {
//            System.out.println("a is legal b is illegal");
//        } else if (a % 5 == 0 && b % 5 == 0) {
//            System.out.println("a is illegal b is legal");
//        } else {
//            System.out.println("both illegal");
//        }


    }

    /**
     * 10 print odd or even numbers between
     *
     * @param a
     * @param b
     */
    public static void printOddOrEvenNumbers(int a, int b) {
        if ((a % 7 == 0 || b % 7 == 0) && (a > 0 && b > 0) && a > b) {
            while (a - 1 > b) {
                if ((a - 1) % 2 == 1) {
                    System.out.println(a - 1);
                }
                a--;
            }
        } else if (a > b) {
            while (a - 1 > b) {
                if ((a - 1) % 2 == 0) {
                    System.out.println(a - 1);
                }
                a--;
            }
        } else if (b > a) {
            while (b - 1 > a) {
                if ((b - 1) % 2 == 0) {
                    System.out.println(b - 1);
                }
                b--;
            }
        } else {
            System.out.println("nothing to print");
        }
    }

    /**
     * 11 coordinate plane
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     */
    public static void coordinatePlane(int x1, int y1, int x2, int y2) {
        if (x1 == 0 || x2 == 0 || y1 == 0 || y2 == 0) {
            System.out.println("enter not 0 coordinates");
        } else if (((x1 > 0 && x2 > 0) || (x1 < 0 && x2 < 0)) && ((y1 > 0 && y2 > 0) || (y1 < 0 && y2 < 0))) {
            System.out.println("in the same quarter");
        } else {
            System.out.println("Not in the same quarter");
        }
    }

    /**
     * 12 creating triangle
     *
     * @param a
     * @param b
     * @param c
     */
    public static void triangle(int a, int b, int c) {
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("it's possible to create a triangle with such sides");
        } else {
            System.out.println("it's not possible to create a triangle with such sides");
        }
    }

    /**
     * 13 count of equal numbers
     *
     * @param a
     * @param b
     * @param c
     */
    public static void countOfEqualNumbers(int a, int b, int c) {
        int count = 1;
        if (a == b) {
            count++;
            if (a == c) {
                count++;
            }
        } else if (a == c) {
            count++;
        } else if (b == c) {
            count++;
        }
        System.out.println(count);
    }

    /**
     * 14 (ax^2 + bx + c)
     *
     * @param a
     * @param b
     * @param c
     */
    public static void decisions(double a, double b, double c) {
        //ax^2 + bx + c = 0
        double d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("Can't be");
        } else if (d == 0) {
            System.out.println(-b / 2 * a);
        } else {
            System.out.println((-b - Math.sqrt(d)) / 2 * a);
            System.out.println((-b + Math.sqrt(d)) / 2 * a);
        }
    }

    /**
     * 15 numbers in non-decreasing order
     *
     * @param a
     * @param b
     * @param c
     */
    public static void nonDecreasingOrder(int a, int b, int c) {
        int min, mid, max;
        if (a <= b && a <= c) {
            min = a;
            if (b <= c) {
                mid = b;
                max = c;
            } else {
                mid = c;
                max = b;
            }
        } else if (b <= a && b <= c) {
            min = b;
            if (a <= c) {
                mid = a;
                max = c;
            } else {
                mid = c;
                max = a;
            }
        } else {
            min = c;
            if (a <= b) {
                mid = a;
                max = b;
            } else {
                mid = b;
                max = a;
            }
        }
        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);
    }


}