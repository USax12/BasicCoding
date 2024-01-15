package com.test.basic.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateTest {

	public static void main(String[] args) {

		List<String> arr = Arrays.asList("a", "b", "a");

		Map<String, Long> collect = arr.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() > 1)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		collect.forEach((i, c) -> System.out.println(i + " " + c));

		Map<String, Long> count = arr.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		count.forEach((i, c) -> System.out.println(i + " " + c));

		/*
		 * String[] str = { "a", "b", "a" }; Map<String, Integer> elementCount = new
		 * HashMap<String, Integer>(); for (String i : str) {
		 * 
		 * elementCount.put(i, elementCount.getOrDefault(i, 0) + 1);
		 * 
		 * } for (Map.Entry<String, Integer> entry : elementCount.entrySet()) { if
		 * (entry.getValue() > 1) { System.out.println(entry.getKey() + " " +
		 * entry.getValue()); } }
		 */
	}

}
