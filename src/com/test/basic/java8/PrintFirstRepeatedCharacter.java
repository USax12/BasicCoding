package com.test.basic.java8;

public class PrintFirstRepeatedCharacter {

	public static void main(String[] args) {
		String str = "banana";

		for (char i : str.toCharArray()) {
			if (str.indexOf(i) != str.lastIndexOf(i)) {
				System.out.println("Repeated Character " + i);
				break;
			}
		}
	}

}
