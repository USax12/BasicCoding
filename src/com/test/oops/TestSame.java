package com.test.oops;

class a {
    public static void my(int a) {
        System.out.println("hi a class ");
    }
}

class b extends a {
    public static void my(int a) {
        System.out.println("hi b class");
    }
}

class TestSame {
    public static void main(String args[]) {
        b b1 = new b();
        b.my(4);    // o/p: hi b class
        a a1;
        //a1.my(2);  	variable a1 might be not intitalized as a1 is not pointing to anyone
        a a2 = new b();
        a2.my(5);   //o/p: hi a class because the method is static
    }
}	
	