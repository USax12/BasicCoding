package com.test.basic.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintAllWithoutRepeat {

	public static void main(String[] args) {

		List<Integer> arr = Arrays.asList(2, 1, 3, 4, 4, 3);

		// o/p: 1 2 3 4

		Set<Integer> set = new HashSet<>();
		arr.stream().filter(a -> set.add(a)).sorted().forEach(a -> System.out.println(a));
	}

}
