package com.java.basic.concept.JavaBasicPrograms.charr;

import java.util.Arrays;
import java.util.List;

public class IntToCharExample {

	public static void main(String[] args) {
		int a = 1;

		System.out.println((a + '0'));

		char c = (char) (a + '0');

		System.out.println(c);

		String str = "abcdefghijklmnopqrstuvwxyz";
		int int_arr[] = new int[256];

		// Increment value by 1 in the index based on char numeric value .
		for (int i = 0; i < str.length(); i++)
			int_arr[str.charAt(i)]++;

		List li = Arrays.asList(int_arr);

		System.out.println(li.toString());

		// assign value to the index .
		int i = 0;
		for (char ch : str.toCharArray()) {
			int_arr[i++] = ch;
		}
		System.out.println(int_arr.toString());
	}
}
