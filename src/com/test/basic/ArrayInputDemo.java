package com.test.basic;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Java Program to take array input from the user using Scanner.
 */

public class ArrayInputDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array");
        int len = sc.nextInt();

        String arr[] = new String[len];
        System.out.println("Please enter array elements");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.next();
        }

        System.out.println("The String array input from user is : ");
        System.out.println(Arrays.toString(arr));

        // saving user input inside a 2D array in Java
        System.out.println("Please enter number of rows and columns of 2D array");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] data = new int[rows][columns];
        System.out.println("Please enter array elements row by row");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int value = sc.nextInt();
                data[i][j] = value;
            }
        }

        System.out.println("The 2d int array input from user is : ");
        System.out.println(Arrays.deepToString(data));

        sc.close();
    }
}



