package com.test.company.program;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Integer> arr = Arrays.asList(1, 2, 5, 6);

		Integer orElse = arr.stream().sorted((a, b) -> b.compareTo(a)).skip(1).findFirst().orElse(null);
		System.out.println(orElse);
	}
}
