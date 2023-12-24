package com.test.basic;

import java.util.Scanner;

public class TestArmstrong {

	boolean checkArmstrong(int num) {

		int a1, rem;
		a1 = num;
		double res = 0.0;

		int n = String.valueOf(num).length();

		while (a1 != 0) {
			rem = a1 % 10;
			int temp = 1;
			for (int i = 0; i < n; i++) {
				temp = temp * rem;
			}

			// res = res + Math.pow(rem,n);
			res = res + temp;
			a1 = a1 / 10;
		}

		return res == num;

	}
	// 153=1*1*1

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int no = sc.nextInt();

		TestArmstrong t = new TestArmstrong();
		if (t.checkArmstrong(no)) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not a Armstrong Number");
		}

	}

}
