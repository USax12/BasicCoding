package com.test.string;

public class StringTest {
    public static void main(String[] args) {
        String S = null;
        //System.out.println( S.toString() );   // 's' is un-initialized and is null
        //	run time error NullPointerException

        String s1 = "Ram";
        String s2 = "Ram";
        String s3 = new String("Ram");
        String s4 = new String("Ram");
        String s5 = "Shyam";
        String nulls1 = null;
        String nulls2 = null;

        System.out.println(" Comparing strings with equals:");
        System.out.println(s1.equals(s2));            //true
        System.out.println(s1.equals(s3));            //true
        System.out.println(s1.equals(s5));            //false
        // System.out.println(nulls1.equals(nulls2));  // NullPointerException 

        System.out.println(" Comparing strings with ==:");
        System.out.println(s1 == s2);        //true
        System.out.println(s1 == s3);        //false
        System.out.println(s3 == s4);        //false
        System.out.println(nulls1 == nulls2);    //true

        System.out.println(" Comparing strings with compareto:");
        System.out.println(s1.compareTo(s3));    //0
        System.out.println(s1.compareTo(s5));    //-1
        // System.out.println(nulls1.compareTo(nulls2));  // NullPointerException 


    }
}