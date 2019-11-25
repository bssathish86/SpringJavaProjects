package com.java.basic.concept.JavaBasicPrograms.operators.logicall;

public class IntegerLogicalOperatorClass {

	public static void main(String[] args) {

		// operators AND (&), OR (|), XOR (^), NOT (!).
		// if the left hand (first) operand is false, then the result is false
		// irrespective of the right hand (second) operand.

		int a = 1;
		int b = 0;
		// boolean c = a | b;
		int d = a & b;
		int e = a ^ b;
		// int f = (!a & b) | (a & !b);
		// boolean g = !a;

		System.out.println(".....................................................");
		System.out.println("Logical operators AND (&), OR (|), XOR (^), NOT (!).");
		System.out.println(".....................................................");
		System.out.println("        a = " + a);
		System.out.println("        b = " + b);
		// System.out.println(" a|b = " + c);
		System.out.println("      a&b = " + d);
		System.out.println("      a^b = " + e);
		// System.out.println("!a&b|a&!b = " + f);
		// System.out.println(" !a = " + g);

		// System.out.println("(!a & b) = " + (!a & b));
		// System.out.println("(a & !b) = " + (a & !b));

		// System.out.println("(!a ^ b) = " + (!a ^ b));
		// System.out.println("(a ^ !b) = " + (a ^ !b));
		System.out.println(".....................................................");
	}
}
