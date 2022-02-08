package com.company.day3;

import java.util.Scanner;

public class Day_3_homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        1. Widening Primitive Conversion (Implicit)

        byte b = sc.nextByte();

        short s = b;
        System.out.println("b=" + b + "   s=" + s);

        int i = s;
        System.out.println("s=" + s + "   i=" + i);
//
//        long l = i;
//        System.out.println("i=" + i + "   l=" + l);
//
//        float f = l;
//        System.out.println("l=" + l + "   f=" + f);
//
//        double d = f;
//        System.out.println("f=" + f + "   d=" + d);


//        2. Narrowing Primitive Conversion (Explicit)
//        double d = sc.nextDouble();
//
//        float f = (float)d;
//        System.out.println("f=" + f + "   d=" + d);
//
//        long l = (long)f;
//        System.out.println("l=" + l + "   f=" + f);
//
//        int i = (int)l;
//        System.out.println("i=" + i + "   l=" + l);
//
//        short s = (short)i;
//        System.out.println("s=" + s + "   i=" + i);
//
//        byte b = (byte)s;
//        System.out.println("b=" + b + "   s=" + s);

//        3. Write a Java program to convert temperature from Fahrenheit to
//        Celsius degree. (Input parameter from console)

//        int far = sc.nextInt();
//        float celsiusInFloat = (float)(far - 32) *5/9;
//        System.out.println(celsiusInFloat);
//        int celsiusInInt = (int)celsiusInFloat;
//        System.out.println(celsiusInInt);

//        4. Compute area  and perimeter of circle.
//        (Input double type radius from console)(PI = 3.14159)

//        double r = sc.nextDouble();
//        double pi = Math.PI;
//        double area = pi * r * r;
//        double perimeter = 2 * pi *r;
//        System.out.println("area=" + area + "   perimeter=" + perimeter);

//        5. Print the result of this expression 1 / 3

//        double d = (double) 1 / 3;
//        float f = (float) 1 / 3;
//        System.out.println(d);
//        System.out.println(f);

//        6. Write java program to print your Name and year of birth
//        using only char primitive and int types.Output` (Ara 1996)

//        char ch1 = 'Y', ch2 = 'u', ch3 = 'r', ch4 = 'a';
//        int yearOfBirth = 1997;
//        System.out.println("" + ch1 + ch2 + ch3 + ch4 + " " + yearOfBirth);

//        7. Cast char to int.

//        char c = 'A';
//        System.out.println((int) c);

//        8. Write a java program which parses your name letters as a integers,\
//        calculate average of them, Output` Ara -- 92.0

//        char ch1 = 'Y', ch2 = 'u', ch3 = 'r', ch4 = 'a';
//        System.out.println((double)(ch1 + ch2 + ch3 + ch4)/4);

//        9. Input int value from console, find char value corresponding
//        to that int value.Output ` 65 - A. (input int in range 32 to 127)

//        int n = sc.nextInt();
//        System.out.println((char)n);

//        10. - Define simple String variable, initialize it
//            - Define another String variable, initialize it
//            - Concatenate them , print output

//        String str1 = "Strings ";
//        String str2 = "conctenation";
//        System.out.println(str1 + str2);

//        11. What happens if concatenate string and another primitive type
//        -	concatenate integer + integer, print output
//        - concatenate String + integer with other primitive types.
//        Example of output` 5 + 10 = 15

//        System.out.println(5 + 10);
//        System.out.println(5 + 'A' + "string");
//        System.out.println("String" + 5 + 'A');

//        12. Try to print this text
//        -	String txt = "We are the so-called "Vikings" from the north.";

//        String txt = "We are the so-called \"Vikings\" from the north.";
//        System.out.println(txt);

//        14. Swap 2 integers without using temp.

//        int a = 5;
//        int b = 10;
//        a = a + b; // a = 15
//        b = a - b; // b = 5
//        a = a - b; // a = 10
//        System.out.println("a = " + a + "\tb = " + b);


        sc.close();
    }
}
