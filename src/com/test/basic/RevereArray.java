package com.test.basic;

import java.util.Arrays;

public class RevereArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int k = 3;
		for (int i = 0; i < arr.length; i += k) {
			int start = i;
			// 0,1,2
			// 3
			int end = Math.min(i + k - 1, arr.length - 1);
			while (start < end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}

		}
		System.out.println(Arrays.toString(arr));
	}
}

// Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9], K = 3 
// Output: 3, 2, 1, 6, 5, 4, 9, 8, 7
