package com.test.company.output;

public class Test3 {

	static {
		System.out.println("Test1");
	}

	{
		System.out.println("Test2");
	}

	{
		System.out.println("Test3");
	}

	static {
		System.out.println("Test4");
	}

	public static void main(String[] args) {

		Test3 t1 = new Test3();
		Test3 t2 = new Test3();
		Test3 t3 = new Test3();
	}
}

// Output

//Test1 Test2 Test3 Test4 Test2 Test3 Test2 Test3 
/*
 * Static will be printed just once but others will be printed at each object
 * creation
 */