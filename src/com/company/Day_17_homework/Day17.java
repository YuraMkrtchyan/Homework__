package com.company.Day_17_homework;

import java.util.Scanner;

public class Day17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1
//        add(5,5);
//        add(5, 3.5f);
//        add(3.5f,5);

        //2  //3
//        System.out.println(task2(3.5f, 4));
//        System.out.println(task2(4, 3.5f));

        //4
//        print(new int[]{3, 4, 5});
//        print(new float[]{3.5f, 4.5f, 5.5f});
//        print(new double[]{3.5, 4.5, 5.5});

        //5
//        System.out.println(search(new int[]{3, 4, 5, 6}));
//        System.out.println(search(new int[]{3, 4, 5, 6}, 5));
//        System.out.println(search(new int[]{3, 4, 5, 6}, 6, 2));

        //6
//        System.out.println(square(2));
//        System.out.println(square(1.5f));
//        System.out.println(square(4, 5));

        //7
//        System.out.println(max(sc.nextInt(), sc.nextInt()));
//        System.out.println(max(sc.nextInt(), sc.nextInt(), sc.nextInt()));
//        System.out.println(max(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));

        //8
//        System.out.println(distance(4, 3));
//        System.out.println(distance(1, 1, -2, -3));

        //9
//        fahrenheitCelsius(16f, 2);
//        fahrenheitCelsius(1, 48f);

        //10
//        System.out.println(remainder(-145));
//        System.out.println(remainder(-165145, 3));
    }

    /**
     * 1. Write a function add with these 3 types of overloading.
     * static void add();
     * Which prints which method is called and result
     */
    public static void add(int a, int b) {
        int sum = a + b;
        System.out.println("you are in 1 " + "sum is " + sum);
    }

    public static void add(int a, float b) {
        float sum = a + b;
        System.out.println("you are in 2 " + "sum is " + sum);
    }

    public static void add(float a, int b) {
        float sum = a + b;
        System.out.println("you are in 3 " + "sum is " + sum);
    }

    /**
     * 2. 3. Write 2 functions where first returns float second returns int,
     * and they have the same parameters for input.
     */
    public static float task2(float b, int a) {
        return (a + b);
    }

    public static int task2(int b, float a) {
        return (int) (a * b);
    }

    /**
     * 4. Write a method called print(), which takes an array and print its
     * contents in the form of [a1, a2, ..., an]. Take note that there is no comma
     * after the last element. The method's signature is as follows:
     * We need to overload this method for int[ ], float[ ], double[ ] arrays.
     */
    public static void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }

    public static void print(float[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void print(double[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    /**
     * 5.
     *
     * @param arr
     * @return
     */
    public static int search(int[] arr) {
        return arr.length;
    }

    public static int search(int[] arr, int a) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                index = i;
            }
        }
        return index;
    }

    public static boolean search(int[] arr, int argument, int index) {
        boolean b = false;
        if (arr[index] == argument) {
            b = true;
        }
        return b;
    }

    /**
     * 6. Write a square() method, which
     * - if get one  int parameter returns the square of cirqle
     * - if get one float parameter returns the square of square
     * - if get 2 parameters returns the square of rectangle
     *
     * @return
     */
    public static double square(int r) {
        return Math.PI * r * r;
    }

    public static float square(float f) {
        return f * f;
    }

    public static int square(int a, int b) {
        return a * b;
    }

    /**
     * 7.Write a max() function which
     * - max(int a, int b)
     * - max(int a, int b, int c)
     * - max(int a , int b, int c, int d)
     */
    public static int max(int a, int b) {
        if (a >= b) {
            return a;
        }
        return b;
    }

    public static int max(int a, int b, int c) {
        int temp = max(a, b);
        if (temp >= c) {
            return temp;
        }
        return c;
    }

    public static int max(int a, int b, int c, int d) {
        int temp = max(a, b, c);
        if (temp >= d) {
            return temp;
        }
        return d;
    }

    /**
     * 8. Write a distance() function which
     * - return distance from (0.0 , 0.0) to (a)
     * distance(int x1 , int x2, int x3, int x4) where (x1, x2) are
     * the coordinates of a distance(int, int)
     * - return the distance from a to b, if method distance get 4 int parameters
     */
    public static double distance(int x1, int x2) {
        return Math.sqrt(x1 * x1 + x2 * x2);
    }

    public static double distance(int a1, int a2, int b1, int b2) {
        return Math.sqrt((a1 - b1) * (a1 - b1) + (a2 - b2) * (a2 - b2));
    }

    /**
     * 9. Write a fahrenheitCelsius() function which
     * - prints fahrenheit value  when pass (float celsius, int choice),
     * where choice is the type of fahrenheit`
     * 1 - print fahrenheit as int value
     * 2 - print fahrenheit as double value
     * , if pass another value print illegal argument
     * - prints celsius when pass (int choice, float fahrenheit)
     * Example` fahrenheitCelsius(32.0, 1);
     * Output` 32 fahrenheit is 0 celsius ;
     * (celsius * 9/5) + 32
     * (fahrenheit − 32) × 5/9
     */
    public static void fahrenheitCelsius(float celsius, int choice) {
        if (choice == 1) {
            int fahrInt = (int) (celsius * 9 / 5 + 32);
            System.out.println(fahrInt);
        } else if (choice == 2) {
            double fahrDouble = celsius * 9 / 5 + 32;
            System.out.printf("%.2f", fahrDouble);
        } else {
            System.out.println("illegal argument");
        }

    }

    public static void fahrenheitCelsius(int choice, float fahrenheit) {
        float celsius;
        if (choice == 1) {
            celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println((int) fahrenheit + " fahrenheit is " + (int) celsius + " celsius");
        } else {
            System.out.println("illegal argument");
        }
    }

    /**
     * 10. Write a function` remainder() which
     * - when pass one int value, return sum of digits for that value. remainder(int)
     * - when pass one int value and one natural int, return reminder from sum of digits
     * divided to second parameter(reminder(int 331, int 5) {
     * return  (3 + 3 + 1) % 5
     */
    public static int remainder(int a) {
        int sum = 0;
        while (a != 0) {
            sum += a % 10;
            a /= 10;
        }
        return Math.abs(sum);
    }

    public static int remainder(int a, int b) {
        return remainder(a) % b;
    }
}
