package com.java.basic.concept.JavaBasicPractice.exception.uncheckedexception;

public class ParentExceptionClass {

	public static void main(String[] args) {
		try {
			int data = 50 / 0; // may throw exception
		}
		// handling the ArithmeticException by using Parent Exception class
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}
}
