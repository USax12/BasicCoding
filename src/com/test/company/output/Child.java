package com.test.company.output;

public class Child extends Parent {
	static void print() {
		System.out.println("Child");
	}

	public static void main(String[] args) {
		Parent a = new Child();
		a.print();
	}
}

class Parent {

	static void print() {
		System.out.println("Parent");
	}

}
//Parent : as we have static method  