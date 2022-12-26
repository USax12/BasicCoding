package com.test.string;

import java.util.Scanner;

class PalindromeString {
    public static void main(String args[]) {
        String original;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        original = sc.nextLine();
        String reverse = new StringBuffer(original).reverse().toString();
        System.out.println("Reversed String: " + reverse);
        if (original.equalsIgnoreCase(reverse))
            System.out.println("Palindrome String");
        else
            System.out.println("Not Palindrome");
    }
}	
		 