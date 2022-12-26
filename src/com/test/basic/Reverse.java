package com.test.basic;

import java.util.Scanner;

public class Reverse {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        int rev = 0, i;
        while (n > 0) {
            i = n % 10;
            rev = rev * 10 + i;
            n = n / 10;
        }
        System.out.println("Reversed No:" + rev);
    }

}