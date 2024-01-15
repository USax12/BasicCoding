package com.test.company.program;

import java.util.HashMap;
import java.util.Map;

public class TestCount {

	public static void main(String[] args) {

		String str = "utkk";
		Map<Character, Integer> map = new HashMap<>();

		for (char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
