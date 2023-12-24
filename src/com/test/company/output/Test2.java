package com.test.company.output;

public class Test2 {

	public static void main(String[] args) {

		Test2 t = new Test2();

		int i = t.check();

		System.out.println(i);
	}

	int check() {

		try {

			System.exit(0);
			System.out.println("try block");

			return 1;

			return 2;

		} catch (Exception e) {

			System.out.println("catch block");

			System.out.println("finally returning");

			return 3;
		} finally {

		}
	}
}
