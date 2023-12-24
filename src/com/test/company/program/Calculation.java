package com.test.company.program;

public class Calculation<T extends Number> {

	private T result;

	public T getResult() {
		return result;
	}

	public Calculation(T result) {
		super();
		this.result = result;
	}

	void calculate(T value, Operation op) {
		switch (op) {
		case ADD:
			add(value);
			break;
		case SUBTRACT:
			Subtract(value);
			break;
		}
	}

	@SuppressWarnings("unchecked")
	private void Subtract(T value) {
		
		if (value instanceof Integer) {
			 result = (T)Integer.valueOf(result.intValue()-value.intValue());
		 }
		 if (value instanceof Double) {
			 result = (T)Double.valueOf(result.doubleValue()-value.doubleValue());
		 }

	}

	private void add(T value) {
		 if (value instanceof Integer) {
			 result = (T)Integer.valueOf(value.intValue()+ result.intValue());
		 }
		 if (value instanceof Double) {
			 result = (T)Double.valueOf(value.doubleValue()+ result.doubleValue());
		 }

	}

	public enum Operation {
		ADD, SUBTRACT;
	}

	public static void main(String[] args) {
		/*
		 * Calculation<Integer> obj = new Calculation<>(5); obj.calculate(1,
		 * Operation.ADD); obj.calculate(1, Operation.SUBTRACT);
		 */
		Calculation<Double> obj1 = new Calculation<>(10.5);
		obj1.calculate(10.0, Operation.SUBTRACT);
		System.out.println(obj1.getResult());

	}

}
