package com.test.company.program;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {

		List<Integer> arrList = new ArrayList<Integer>();

		arrList.stream().limit(9).forEach(System.out::println);

		arrList.stream().skip(8).findFirst().ifPresent(System.out::println);

		// abcdsfdfabcsdewabcad

		String in = "abcdsfdfabcsdewabcad";

		String find = "abc";

		int count = in.codePoints().collect(StringBuilder::new, (sb, c) -> sb.append((char) c), StringBuilder::append)
				.toString().split(find, -1).length - 1;

		System.out.println(count);

	}

}
