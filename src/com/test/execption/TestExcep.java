package com.test.execption;

class TestExcep {
    public static void main(String args[]) {
        TestExcep t = new TestExcep();
        //return (t.testFunc());	Compile Error: incompatible types: as function is returning int
        int a = t.testFunc();
        System.out.println(a);
        //Inside try block Arithmetic Exception Inside Finally block 119
    }

    public int testFunc() {
        try {
            System.out.println("Inside try block");
            int a = 5 / 0;
            return 5;
        } catch (Exception e) {
            System.out.println("Arithmetic Exception");
            return 110; // this will be overridden if there is any return statement in finally block
        } finally {
            System.out.println("Inside Finally block");
            return 119;
            // System.out.println("Inside Finally block");		 if we write after return statement , it will generate compile time exception Unreachable statement
        }

    }
}	
	