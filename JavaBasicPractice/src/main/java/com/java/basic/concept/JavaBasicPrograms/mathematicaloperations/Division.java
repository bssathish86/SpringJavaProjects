package com.java.basic.concept.JavaBasicPrograms.mathematicaloperations;

public class Division {

	public static void main(String[] args) {

		int a = 10;
		int b = 10;

		int c = a / b;

		long a1 = 10l;
		long b1 = 10l;

		long c1 = a / b;
		long d1 = a1 / b1;

		float a2 = 10;
		float b2 = 10;

		float c2 = a / b;
		float d2 = a1 / b1;
		float e2 = a2 / b2;

		double a3 = 10.0;
		double b3 = 10.0;

		double c3 = a / b;
		double d3 = a1 / b1;
		double e3 = a2 / b2;
		double f3 = a3 / b3;

		System.out.println("divide two int values and assign it to int : " + a / b);

		System.out.println("divide two int values and assign it to int : " + a / b);
		System.out.println("divide two long values and assign it to long : " + a / b);

		System.out.println("divide two int values and assign it to float : " + d1);
		System.out.println("divide two float values and assign it to float : " + a1 / b1);

		System.out.println("divide two int values and assign it to double : " + c2);
		System.out.println("divide two float values and assign it to double : " + d2);
		System.out.println("divide two double values and assign it to double : " + e2);
	}
}
