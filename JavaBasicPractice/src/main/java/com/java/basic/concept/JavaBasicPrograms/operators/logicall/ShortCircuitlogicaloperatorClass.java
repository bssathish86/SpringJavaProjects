package com.java.basic.concept.JavaBasicPrograms.operators.logicall;

public class ShortCircuitlogicaloperatorClass {

	// operators AND (&&), OR (||).

	/*
	 * short-circuit AND (&&) is used, if the first value is false, second value is
	 * not evaluated. Similarly for short-circuit OR (||), if the first value is
	 * true, then second value is not evaluated. These short-circuit operators will
	 * be useful when we want to control the evaluation of right hand operand
	 */

	public static void main(String[] args) {

		int c = 0, d = 100, e = 50;

		if (c == 1 && e++ < 100) {
			d = 150;
		}

		System.out.println(".....................................................");
		System.out.println("Short-circuit operators AND (&&), OR (||).");
		System.out.println(".....................................................");
		System.out.println("c = 0, d = 100, e = 50; \n(c == 1 && e++ < 100 )\n  d = 150;  \nresult : e = " + e);
		System.out.println(".....................................................");
	}
}
