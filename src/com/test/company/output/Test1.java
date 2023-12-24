package com.test.company.output;

import java.io.IOException;

public class Test1 {

	public static void main(String[] args) {

		Test1 t = new Test1();
		int i = t.check();
		System.out.println(i);
	}

	int check() {
		try {
			throw new IOException();
			return 1;// line 13

		} catch (

		Exception e) {

		} finally {
			System.out.println("catch block");
			System.out.println("finally returning");

		}
		return 0;

	}

}
