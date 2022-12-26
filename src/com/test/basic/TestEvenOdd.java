package com.test.basic;

import java.util.Scanner;

class TestEvenOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no:");
        int n = sc.nextInt();
        if ((n / 2) * 2 == n) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}	
			
		