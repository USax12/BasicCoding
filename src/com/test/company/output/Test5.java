package com.test.company.output;

public class Test5 {
	void print(String s) {
		System.out.println("String");
	}

	void print(StringBuffer sb) {
		System.out.println("StringBuffer");
	}

	public static void main(String args[]) {
		Test5 e = new Test5();
		e.print(null);
	}
}
