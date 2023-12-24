package com.test.basic;

import java.util.HashSet;

class Country {
	private String name;

	Country(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
}

public class CollClient {

	public static void main(String[] str) {
		HashSet<Object> myMap = new HashSet<>();
		String s1 = new String("India");
		String s2 = new String("India");
		Country s3 = new Country("France");
		Country s4 = new Country("France");
		myMap.add(s1);
		myMap.add(s2);
		myMap.add(s3);
		myMap.add(s4);
		System.out.println(myMap);
		// [France, France, India]
		/*
		 * As we had not overridden hashcode() and equals() method therefore the default
		 * implementations from the Object class are used which consider two objects
		 * equal only if they are the exact same object (i.e., they have the same memory
		 * address) and spring by default overrides these methods
		 */
	}
}