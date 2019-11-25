package com.java.basic.concept.JavaBasicPrograms.iint;

public class IntegerClass {

	public static void main(String[] args) {

		int int_value = Integer.MAX_VALUE;

		// shifting integer bit values.
		System.out.println(Integer.toString(Integer.MAX_VALUE, 2));
		System.out.println(Integer.toString((Integer.MAX_VALUE >> 2), 2));
		System.out.println(Integer.toUnsignedString(Integer.MIN_VALUE, 2));
		System.out.println(Integer.toString((Integer.MIN_VALUE >> 0), 2));
		System.out.println(Integer.toString((Integer.MIN_VALUE >>> 0), 2));

		System.out.println("int values in decimal format : " + Integer.toString(int_value));
		System.out.println("int values in binary string format : " + Integer.toBinaryString(int_value));
		System.out.println("int values in unsigned binary format : " + Integer.toString(int_value, 2));
		System.out.println("int values in unsigned binary format : " + Integer.toUnsignedString((int_value), 2));
		System.out.println("counts the bit of int binary value : " + Integer.bitCount(int_value));
		System.out.println("adding two max int values " + Integer.toBinaryString((int_value + int_value)));
	}
}
