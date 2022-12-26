package com.test.string;

import java.util.Arrays;
import java.util.Scanner;

class reverseWordInMyString {
    public static void main(String args[]) {
        String original;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        original = sc.nextLine();
        String str2 = "";
        char ch;

        String[] words = original.split(" ");
        System.out.println(words);
        System.out.println("length" + "  " + words.length);

        System.out.println(Arrays.toString(words));
        String rev = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseword = "";
            reverseword = new StringBuffer(word).reverse().toString();
            rev = rev + reverseword + " ";

        }

        //System.out.println("Original String "+ word);
        System.out.println("Reverse Words in String " + rev);


    }
}	
		 