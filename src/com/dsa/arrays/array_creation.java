package com.dsa.arrays;

import java.util.Arrays;
import java.util.Scanner;

// program to add an element at a particular index and iterate the whole array then
public class array_creation {

	public static void main(String[] args) {

		int indexOfNewElement, valueOfNewElement;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the elements of the array separated by commas: ");
		String input = scanner.nextLine();

		String[] elements = input.split(",");

		int a[] = new int[elements.length]; // original array
		System.out.println("Original Array" + Arrays.toString(a));
		int b[] = new int[elements.length + 1]; // new array

		for (int i = 0; i < elements.length; i++) {
			a[i] = Integer.parseInt(elements[i]); // a[0],a[1]
		}

		System.out.println("Enter index of new value to be inserted : ");
		indexOfNewElement = scanner.nextInt(); // 2
		System.out.println("Enter the value to be inserted :");
		valueOfNewElement = scanner.nextInt();
		for (int i = 0; i < elements.length + 1; i++) { // 10 20 30 40 50
			if (i < indexOfNewElement) { // 10,20
				b[i] = a[i];
			} else if (i == indexOfNewElement) {
				b[i] = valueOfNewElement;
			} else {
				b[i] = a[i - 1];
			}
		}

		System.out.println("The elements are:");
		for (int i = 0; i < a.length + 1; i++) {
			System.out.println(b[i]);
		}

	}
}
