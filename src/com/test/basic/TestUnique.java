package com.test.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestUnique {

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(1, 1, 2, 2, 2, 3, 4, 5, 5);

		Map<Integer, Integer> map = new HashMap<>();

		for (Integer i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);

		}
		map.entrySet().stream().filter(a -> a.getValue() == 1).forEach(entry -> System.out.println(entry.getKey()));

		/*
		 * for (Map.Entry<Integer, Integer> entry : map.entrySet()) { if
		 * (entry.getValue() == 1) { System.out.println(entry.getKey()); } }
		 */

	}

	// input: {1, 1, 2, 2, 2, 3, 4, 5, 5}
	// output: {3,4}

}
