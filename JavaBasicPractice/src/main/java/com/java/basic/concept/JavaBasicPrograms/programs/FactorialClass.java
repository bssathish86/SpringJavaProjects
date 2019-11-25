package com.java.basic.concept.JavaBasicPrograms.programs;

public class FactorialClass {

	public static void main(String[] args) {

		FactorialClass factorial = new FactorialClass();

		System.out.println(factorial.getRecursiveFactorial(6));
		System.out.println(factorial.getIterativeFactorial(6));
	}

	public int getRecursiveFactorial(int n) {
		if (n < 0)
			return -1;
		else if (n < 2)
			return 1;
		else
			return (n * getRecursiveFactorial(n - 1));
	}

	public int getIterativeFactorial(int n) {
		if (n < 0)
			return -1;
		int fact = 1;
		for (int i = 1; i <= n; i++)
			fact *= i;
		return fact;
	}

}
