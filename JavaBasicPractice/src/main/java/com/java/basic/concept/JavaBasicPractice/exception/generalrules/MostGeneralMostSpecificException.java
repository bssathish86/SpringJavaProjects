package com.java.basic.concept.JavaBasicPractice.exception.generalrules;

public class MostGeneralMostSpecificException {

	public static void main(String args[]) {
		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
		} catch (Exception e) {
			System.out.println("common task completed");

		}
		// Unreachable catch block for ArithmeticException. It is already handled by the
		// catch block for Exception.
		/*
		 * catch (ArithmeticException e) { System.out.println("task1 is completed");
		 * 
		 * }
		 */
		// Unreachable catch block for ArithmeticException. It is already handled by the
		// catch block for Exception.
		/*
		 * catch (ArrayIndexOutOfBoundsException e) {
		 * System.out.println("task 2 completed"); }
		 */
		System.out.println("rest of the code...");
	}
}
