package com.test.company.program;

import java.util.Arrays;
import java.util.List;

public class TestLength {

	public static void main(String[] args) {

		List<String> str = Arrays.asList("sky", "red", "blue", "yellow");

		str.stream().filter(s -> s.length() > 3).forEach(System.out::println);
	}

}

