package com.test.company.output;

public class Sample1 {
	public static void main(String[] args) {
		Sample1 s = new Sample1();
		s.printVal(null);
		s.printVal(1);
		s.printVal(s);

	}

	public void printVal(Object i) {
		System.out.println("obj called " + i);
		// obj called com.sapiens.Sample@1db9742
	}

	public void printVal(Integer i) {
		System.out.println("Integer called " + i); // Integer called null
	}

	public void printVal(int i) {
		System.out.println("int called " + i); // int called 1
	}
}
