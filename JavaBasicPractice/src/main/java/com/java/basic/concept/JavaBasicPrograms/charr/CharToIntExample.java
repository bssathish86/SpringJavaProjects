package com.java.basic.concept.JavaBasicPrograms.charr;

public class CharToIntExample {

	public static void main(String[] args) {

		char c = 'a';
		char c2 = '1';

		int i = c;
		int i2 = c2;

		System.out.println(i);
		System.out.println(i2);

		int i3 = 49;
		char c3 = (char) i3;

		System.out.println(c3);

		char c1 = '1';
		int a1 = Character.getNumericValue(c1);
		System.out.println(a1);
	}
}
