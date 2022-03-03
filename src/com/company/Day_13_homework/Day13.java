package com.company.Day_13_homework;

import java.util.Arrays;
import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1
//        System.out.println("enter matrix's size");
//        matrix();

        //2
//        aboveAndBelowDiagonal();

        //3
//        symmetricMatrix();

        //4
//        athlete();

        //5
//        highestScore();

        //6
//        highestScoreRow();

        //8
//        addMatrices();

        //9
//        spiral();
    }

    /**
     * generating matrix
     */
    public static int[][] generateMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter matrix's size");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 0;
            }
        }
        return matrix;
    }

    public static int[][] inputMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter matrix's size");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println("enter elements");
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }

    /**
     * 1.Create an n × n array and fill it according to the following rule:
     * - the numbers on the diagonal going from the upper right to the lower left corner are equal to 1;
     * - the other elements are 0;
     * - print matrix
     */
    public static void matrix() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length - i - 1; j++) {
                matrix[i][j] = 0;
            }
            matrix[i][matrix.length - i - 1] = 1;
            for (int j = matrix.length - 1; j > matrix.length - i - 1; j--) {
                matrix[i][j] = 0;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }

    /**
     * 2. Create an n × n array and fill it according to the following rule:
     * - the numbers on the diagonal going from the upper right to the lower left corner are equal to 1;
     * - numbers above this diagonal are equal to 0;
     * - the numbers below this diagonal are equal to 2
     */
    public static void aboveAndBelowDiagonal() {
        int[][] matrix = generateMatrix();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length - i - 1; j++) {
                matrix[i][j] = 0;
            }

            matrix[i][matrix.length - i - 1] = 1;

            for (int j = matrix.length - 1; j > matrix.length - i - 1; j--) {
                matrix[i][j] = 2;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * 3.Check if the two-dimensional array is symmetrical about the main diagonal.
     * The main diagonal is the one that goes from the upper left corner of the
     * two-dimensional array to the lower right.
     * Example` Input` 3           Input` 3
     * 0 1 2              0 0 0
     * 1 5 3              0 0 0
     * 2 3 4              1 0 0
     * Output` YES        Output` NO
     */
    public static void symmetricMatrix() {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = generateMatrix();

        System.out.println("enter elements");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    System.out.println("no");
                    return;
                }
            }
        }
        System.out.println("yes");
    }

    /**
     * 4. line with max sum of elements
     */
    public static void athlete() {
        int[][] matrix = inputMatrix();
        int max = 0;
        int sum = 0;
        int line = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            if (sum > max) {
                max = sum;
                line = i;
            }
            sum = 0;
        }
        System.out.println("max is " + max + "   line is " + line);


    }

    /**
     * 5. row and column of the max element
     */
    public static void highestScore() {
        int[][] matrix = inputMatrix();
        int maxElem = 0;
        int row = 0;
        int column = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxElem) {
                    maxElem = matrix[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        System.out.println("maxElem = " + maxElem + "  row = " + row + "  column = " + column);
    }

    /**
     * 6. row with the highest element
     */
    public static void highestScoreRow() {
        int[][] matrix = inputMatrix();

        int maxElem = 0;
        int sum = 0;
        int currentSum = 0;
        int row = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                currentSum += matrix[i][j];
                if (matrix[i][j] > maxElem) {
                    maxElem = matrix[i][j];
                    row = i;
                    sum = currentSum;
                }
                if (matrix[i][j] == maxElem) {
                    if (currentSum > sum) {
                        row = i;
                    }
                }
            }
            currentSum = 0;
        }
        System.out.println(row);

    }

    /**
     * 8.Write a Java program to add two matrices of the same size.
     */
    public static void addMatrices() {
        int[][] matrix1 = inputMatrix();
        int[][] matrix2 = inputMatrix();
        int[][] finalMatrix = new int[matrix1.length][2 * matrix1.length];
        System.out.println();

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length * 2 - 1; j++) {
                if (j < matrix1.length) {
                    finalMatrix[i][j] = matrix1[i][j];
                }
            }
        }
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = matrix1[i].length; j < matrix1[i].length * 2; j++) {
                finalMatrix[i][j] = matrix2[i][j - matrix1[i].length];
            }
        }

        for (int i = 0; i < finalMatrix.length; i++) {
            for (int j = 0; j < finalMatrix[i].length; j++) {
                System.out.print(finalMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * 9.It is required to fill an array of size N × N with ones in a spiral
     * (starting from the upper left corner clockwise)
     * 1 1 1 1 1 1 1
     * 0 0 0 0 0 0 1
     * 1 1 1 1 1 0 1
     * 1 0 0 0 1 0 1
     * 1 0 1 1 1 0 1
     * 1 0 0 0 0 0 1
     * 1 1 1 1 1 1 1
     */
    public static void spiral() {

        int[][] arr =
                {
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0}
                };

        int lastRow = 0;
        int lastCol = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length - lastRow; j++) {
                arr[i][j] = (1);
            }
            lastRow++;

            for (int j = 0; j < arr.length - lastCol; j++) {
                arr[j + lastCol][arr[j].length - 1] = 1;
            }
            lastCol++;

            for (int j = 0; j < arr[i].length - lastRow; j++) {
                arr[arr.length - lastRow][arr.length - lastCol - j] = 1;
            }
            lastRow++;

            for (int j = 0; j < arr.length - lastRow - 1; j++) {
                arr[arr.length - lastRow + 1][lastRow - 2 + j] = 1;
            }
            lastCol++;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
//
//
//            //    1    2   3  4
//            //    12  13  14  5
//            //    11  16  15  6
//            //    10   9   8  7
//            //j-n vorpes tox enq ogtagorcum. 1in tox@ lracraca, dra hamar j < matrix.length-1
//            // j+i---erkrorx qarakusu hamar
//            //verjin syun
//
//
//            //verjin togh
//
//            for (int j = matrix.length - 1 - i; j >= 0; j--) {
//                matrix[matrix.length - 1][j] = 1;
//            }
//
//            for (int j = 1; j < matrix.length - 1; j++) {
//                matrix[matrix.length - j - 1][i] = 1;
//            }
//        }
//        int[][] arr = generateMatrix();
////        for (int[] item : matrix) {
////            Arrays.fill(item, 1);
////        }
//        /**
//         1 1 1 1 1 1 1
//         0 0 0 0 0 0 1
//         1 1 1 1 1 0 1
//         1 0 0 0 1 0 1
//         1 0 1 1 1 0 1
//         1 0 0 0 0 0 1
//         1 1 1 1 1 1 1
//         */
//        int lastRow = 0;
//        int lastCol = 0;
//        for(int i = 0; i< arr.length; i ++){
//            if(lastRow == i){
//                for (int j = 0; j < arr[i].length; j++) {
//                    arr[i][j] = 1;
//                }
//            }
//            for(int j = 0; j< arr[i].length; j++){
//
//            }
//        }
//
//        for (int i = 0; i < 2; i++) {
//            // verevi tox
//            //99%
////            for (int j = 0; j < matrix.length - 1 - i; j++) {
////                matrix[i][j] = 1;
////            }
//            // aj syun
//            for (int j = 1 + i; j < matrix.length - 1 - i; j++) {
//                matrix[j][matrix.length - 1 - i] = 1;
//                // i+j == 1     last index
//                //         length -> 7 -1 - 1 = 5
//            }
//
//
//
//
////            // nerqevi tox
////            for (int j = 0; j <; j++) {
////
////            }
//
//
//            //minchev mejtexi toxna bardzranum
//            // dzax syun
//            for (int j = 0; j <; j++) {
//
//            }
//        }
//
//
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }

    }
}


