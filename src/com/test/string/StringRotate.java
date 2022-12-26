package com.test.string;

import java.util.Scanner;

class StringRotate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();
        System.out.println("Please enter rotation of String");
        String rot = sc.next();

        //string is rotated if it has the same length,contains the same characters,and they are rotated around
        //one of the characters
        //	System.out.println(str.length()+"  testing  "+(str + str));
        if (str.length() == rot.length() && ((str + str).contains(rot)))
            System.out.println("Rotated Strings");
        else
            System.out.println("Not Rotated Strings");
    }
}	


