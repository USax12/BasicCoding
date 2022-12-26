package com.test.string;

import java.util.Scanner;

class ReverseString {
    public static void main(String args[]) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        str = sc.nextLine();
        String str2 = "";
        char ch;
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            ch = str.charAt(i);
            str2 = str2 + ch;
        }
        System.out.println("Reversed String: " + str2);

    }
}