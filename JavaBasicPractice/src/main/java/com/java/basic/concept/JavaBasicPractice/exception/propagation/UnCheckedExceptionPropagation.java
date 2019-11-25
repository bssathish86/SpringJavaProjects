package com.java.basic.concept.JavaBasicPractice.exception.propagation;

public class UnCheckedExceptionPropagation {

	void m() {

		// un-checked exception.
		int arr[] = { 1, 3, 5, 7 };
		System.out.println(arr[10]); // may throw exception
		System.out.println("rest of the code");
	}

	void n() {
		m();
	}

	void p() {
		try {
			// handling the ArithmeticException exception.
			n();
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException handeled");
		}
	}

	public static void main(String[] args) {

		UnCheckedExceptionPropagation obj = new UnCheckedExceptionPropagation();
		try {
			obj.p();
		}
		// handling the Array exception.
		catch (Exception e) {
			System.out.println("Exception handeled");
		}
		System.out.println("normal flow");
	}
}
