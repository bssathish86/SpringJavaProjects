package com.java.basic.concept.JavaBasicPrograms.iint;

public class IntegerShiftOperation {

	public static void main(String[] args) {

		System.out.println("....................................");
		System.out.println(" shiftWithSignRight  >> " + Integer.MAX_VALUE);
		System.out.println("....................................");
		shiftWithSignRight(Integer.MAX_VALUE);
		System.out.println("....................................");

		System.out.println("....................................");
		System.out.println(" shiftWithSignRight  >> " + Integer.MIN_VALUE);
		System.out.println("....................................");
		shiftWithSignRight(Integer.MIN_VALUE);
		System.out.println("....................................");

		System.out.println(" shiftWithoutSignRight >>> " + Integer.MAX_VALUE);
		System.out.println("....................................");
		shiftWithoutSignRight(Integer.MAX_VALUE);
		System.out.println("....................................");

		System.out.println(" shiftWithoutSignRight >>> " + Integer.MIN_VALUE);
		System.out.println("....................................");
		shiftWithoutSignRight(Integer.MIN_VALUE);
		System.out.println("....................................");

		System.out.println(" shiftLeft << " + Integer.MAX_VALUE);
		System.out.println("....................................");
		shiftLeft(Integer.MAX_VALUE);
		System.out.println("....................................");

		System.out.println(" shiftLeft << " + Integer.MIN_VALUE);
		System.out.println("....................................");
		shiftLeft(Integer.MIN_VALUE);
		System.out.println("....................................");

		System.out.println(" shiftLeft << " + Integer.parseInt("1"));
		System.out.println("....................................");
		shiftLeft(Integer.parseInt("1"));
		System.out.println("....................................");
	}

	private static void shiftWithSignRight(int value) {
		for (int i = 0; i <= 31; i++) {
			int j = value >> i;
			System.out.println(Convert32BitInteger.intToString(j, 32) + " interger value : " + j);
		}
	}

	private static void shiftWithoutSignRight(int value) {
		for (int i = 0; i <= 31; i++) {
			int j = value >> i;
			System.out.println(Convert32BitInteger.intToString(j, 32) + " interger value : " + j);
		}
	}

	private static void shiftLeft(int value) {
		for (int i = 0; i <= 31; i++) {
			int j = value << i;
			System.out.println(Convert32BitInteger.intToString(j, 32) + " interger value : " + j);
		}
	}
}
