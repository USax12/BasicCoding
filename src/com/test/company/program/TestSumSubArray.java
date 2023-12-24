package com.test.company.program;

public class TestSumSubArray {

	public static void main(String[] args) {

		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };

		// Output: [4, -1, -2, 1, 5]

		int temp = 0;
		int start = 0;
		int end = 0;
		int max = arr[0];
		int curr = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > max + arr[i]) {
				curr = arr[i];
				start = i;

			} else {
				max += arr[i];

			}
			if (curr > max) {
				max = curr;
				temp = start;
				end = i;

			}
		}
		for (int i = start; i <= end; i++) {
			System.out.println(arr[i]);
		}
	}
}
