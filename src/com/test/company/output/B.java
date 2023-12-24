package com.test.company.output;

class A {
	A() {
		System.out.println("A constructor");
	}

	public void m1() {
		System.out.println("m1():in classA");
	}
}

class B extends A {

	B() {
		System.out.println("B Constructor");
	}

	public void m1() {
		System.out.println("m1:in class B");
	}

	public static void main(String[] args) {
		A a = new B();
		a.m1();
	}

}

/*
 * constructor gets initialized for both as soon new operator is called A
 * constructor B Constructor m1:in class B
 * 
 */