package com.test.basic.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicateInList {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 3, 2);
		Set<Integer> set = new HashSet<>();

		// Duplicate elements are:3,2 to print in this format
		/*
		 * String res = list.stream().filter(n ->
		 * !set.add(n)).map(String::valueOf).collect(Collectors.joining(","));
		 * 
		 * System.out.print(" Duplicate elements are:" + res);
		 */

		// 32
		list.stream().filter(a -> !set.add(a)).forEach(System.out::print);
	}
}
