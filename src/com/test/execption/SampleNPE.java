package com.test.execption;

public class SampleNPE {
    public static void main(String[] args) {
        String s = null;
        System.out.println(s.toString());   // 's' is un-initialized and is null
    }
}