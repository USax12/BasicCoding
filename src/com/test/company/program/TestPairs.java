package com.test.company.program;

import java.util.stream.Stream;

public class TestPairs {

	public static void main(String[] args) {

		String str = "( { [ ) } ]";

		boolean bal = Stream.of(str.split("")).reduce(new Bracket(), Bracket::process, Bracket::com).isBal();

		System.out.println(bal);
	}

}

class Bracket {

	int count = 0;

	Bracket process(String ch) {
		if ("{[(".contains(ch)) {
			count++;
		} else if ("}])".contains(ch)) {
			count--;
		}
		return this;
	}

	Bracket com(Bracket b) {
		count += b.count;
		return this;
	}

	boolean isBal() {
		return count == 0;
	}
}



//I/P 1 - ( [ { } ] )
