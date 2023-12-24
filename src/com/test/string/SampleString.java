package com.test.string;

public class SampleString {
    public static void main(String[] args) {
        String S = null;
        //System.out.println( s.toString() );   // 's' is un-initialized and is null
        //	compile time error NullPointerException


        String s1 = "abc";
        String s2 = "abc";
        System.out.println("LITERAL Example*****");
        System.out.println( s1=s2 );   		//abc
        System.out.println(s1 == s2);            //true
        System.out.println(s1.equals(s2));    //true

        String s3 = "abc";
        String s4 = "abc4";
        System.out.println("LITERAL*****");
        System.out.println(s3 == s4);            //false
        System.out.println(s3.equals(s4));    //false

        String s = new String("AB");
        String w = new String("AB");
        System.out.println("NEW OPERATOR*****");
        System.out.println(s == w);            //false
        System.out.println(s.equals(w));        //true

        String a = "abc";
        StringBuffer b = new StringBuffer(a);
        System.out.println(b);        //abc

        String c = "Sachin";
        String d = "SACHIN";

        System.out.println(c.equals(d));//false
        System.out.println(c.equalsIgnoreCase(d));//true

    }
}