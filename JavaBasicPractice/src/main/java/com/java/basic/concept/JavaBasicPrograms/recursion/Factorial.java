package com.java.basic.concept.JavaBasicPrograms.recursion;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(factorial(3));
	}

	private static int factorial(int i) {
		if (i == 0)
			return 1;
		return factorial(i - 1) * i;
	}
}
