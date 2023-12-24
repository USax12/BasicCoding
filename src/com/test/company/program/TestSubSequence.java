package com.test.company.program;

import java.util.ArrayList;
import java.util.List;

public class TestSubSequence {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 2, 10, 14, 19, 11, 3, 7, 9, 13 };
		findSubSeq(arr);
	}
	// [1,2,3,2,10,14,19,11,3,7,9,13]
	static void findSubSeq(int[] arr) {

		int n = arr.length;
		int[] len = new int[n];

		for (int i = 1; i < n; i++) {

			for (int j = 0; j < i; j++) {

				if (arr[i] > arr[j] && len[i] < len[j] + 1) {
					len[i] = len[j] + 1;
				}

			}
		}

		int maxLength = 0;
		int last = 0;

		for (int i = 0; i < n; i++) {
			if (len[i] > maxLength) {
				maxLength = len[i];
				last = i;
			}
		}

		List<Integer> a1 = new ArrayList<>();
		List<List<Integer>> finalList = new ArrayList<>();
		// a1 a2, last,

		findSubSeqAll(arr, len, last, maxLength, a1, finalList);

		System.out.println("maxLength" + maxLength);
		for(List<Integer> arr1: finalList) {
			System.out.println(arr1);
		}

	}

	private static void findSubSeqAll(int[] arr, int[] len, int last, int maxLength, List<Integer> a1,
			List<List<Integer>> finalList) {
		if (maxLength == 0) {
			finalList.add(new ArrayList<>(a1));
		}

		for (int i = last; i >= 0; i--) {
			if (arr[last] > arr[i] && len[last] == len[i] + 1) {
				a1.add(arr[i]);
				findSubSeqAll(arr,len,i,maxLength-1,a1,finalList);
				a1.remove(a1.size()-1);
			}
		}

	}
}

// [1,2,3,2,10,14,19,11,3,7,9,13] - 2,10,14,19
