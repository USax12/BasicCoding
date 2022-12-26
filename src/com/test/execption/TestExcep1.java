package com.test.execption;

class TestExcep1 {
    public static void main(String args[]) {
        try {
            System.out.println("Inside try block");
            int a = 5 / 0;

        } catch (Exception e) {
            System.out.println("inside catch");
        } finally {
            System.out.println("Inside Finally block");

        }
        System.out.println("out");    //if there occurs an exception in try block and it is not matched with catch block then this line will not be exceuted.
    }
}