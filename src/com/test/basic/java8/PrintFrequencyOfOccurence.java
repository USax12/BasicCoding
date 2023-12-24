package com.test.basic.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintFrequencyOfOccurence {

	public static void main(String[] args) {

		List<Integer> arr = Arrays.asList(1, 2, 2, 2, 3, 3);

		// o/p: 1=1,2=2,3=3

		Map<Integer, Long> map = arr.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		map.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

	}

}
