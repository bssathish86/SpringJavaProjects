package com.java.basic.concept.JavaBasicPrograms.string;

public class StringClass {

	public static void main(String[] args) {

		// String literals always go to string pool.

		// Create string with new keyword, two objects will be created i.e. one in the
		// Heap Area and another in the String constant pool. The created string object
		// reference always points to heap area object.

		String a = "abcd";
		String b = "abcd";
		String c = a;
		String d = new String("abcd");

		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		System.out.println("d.intern() : " + d.intern());
		System.out.println("a == b " + (a == b));
		System.out.println("b == c " + (b == c));
		System.out.println("c == d " + (c == d));
		System.out.println("a == d.intern() " + (a == d.intern()));
		System.out.println("a.equals(b) " + a.equals(b));
		System.out.println("a == c " + (a == c));
		System.out.println("b == c " + (b == c));
		System.out.println("b.equals(c) " + b.equals(d));
	}
}
