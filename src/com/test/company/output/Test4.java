package com.test.company.output;

public class Test4 {
	public static void main(String[] args) {
		String s = "a";
		StringBuffer sb = new StringBuffer(s);

		System.out.println(s + " " + sb);

		modify(s, sb);

		System.out.println(s + " " + sb);
	}

	private static void modify(String s, StringBuffer sb) {
		s = "b";
		sb.append(s);
		System.out.println(s + " " + sb);
	}
}

//Output:

//a a
//b ab
//a ab
/*
 * In modify you are modifying the local variable s, which is a copy of the
 * original reference passed to the method. This modification does not affect
 * the original variable in the main method
 */
