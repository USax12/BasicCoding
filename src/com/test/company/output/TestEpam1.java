package com.test.company.output;

import java.util.Optional;
import java.util.stream.Stream;

public class TestEpam1 {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("a", "b", "c", "b").filter(element -> element.contains("b"));
		// filter return stream

		Optional<String> anyElement = stream.findAny();
		// Returns an Optional describing some element of the stream,
		// or an empty Optional if the stream is empty

		System.out.println("anyElement: " + anyElement.get());
		// anyElement: b

		Optional<String> firstElement = stream.findFirst();
		// IllegalStateException: stream has already been operated upon or closed

		System.out.println("firstElement: " + firstElement.get());

	}

}
