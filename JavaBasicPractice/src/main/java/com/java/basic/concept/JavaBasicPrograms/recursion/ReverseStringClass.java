package com.java.basic.concept.JavaBasicPrograms.recursion;

public class ReverseStringClass {

	public static void main(String[] args) {
		String str = "abcdef";
		char[] ch = str.toCharArray();
		reverseStr(ch, 0);
	}

	private static char reverseStr(char[] ch, int n) {

		if (ch.length - 1 <= n)
			return ch[n];

		System.out.print(reverseStr(ch, n + 1));
		return ch[n];
	}
}
