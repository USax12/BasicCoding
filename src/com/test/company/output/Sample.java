package com.test.company.output;

public class Sample {

	int test_a, test_b;

	Sample(int a, int b) {
		test_a = a;
		test_b = b;
	}

	public static void main(String args[]) {
		Sample test = new Sample();
		System.out.println(test.test_a + " " + test.test_b);
	}

}

//Output: Compile time exception as we have not created 
//default constructor but using paramterized constructor.