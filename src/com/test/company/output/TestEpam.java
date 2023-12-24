package com.test.company.output;

public class TestEpam {

	int i[] = { 0 };

	public static void main(String args[]) {
		int i[] = { 1 };
		alter(i);
		System.out.println("" + i[0]);
		// 1 as method level i will not be overridden by the alter method
	}

	public static void alter(int i[]) {
		int j[] = { 2 };
		i = j;
		System.out.println("alter " + i[0]);
	}

}
