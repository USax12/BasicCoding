package com.test.company.output;



public class Test6 {

	void print(float f) {
		System.out.println("float");
	}

	void print(double d) {
		System.out.println("Double");
	}

	public static void main(String args[]) {
		Test6 y = new Test6();
		y.print(10.0);
	}

}
