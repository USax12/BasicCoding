package com.test.basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		List<Integer> arr = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 5, 6, 6, 7);
		Set<Integer> set = new HashSet<>();
		arr.stream().filter(a -> !set.add(a)).forEach(System.out::print);
	}

	// {1,1,2,2,3,3,4,5,6,6,7}
	// o/p 1,2,3,6
}
