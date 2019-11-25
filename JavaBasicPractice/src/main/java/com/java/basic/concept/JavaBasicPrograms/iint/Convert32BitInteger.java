package com.java.basic.concept.JavaBasicPrograms.iint;

public class Convert32BitInteger {

	public static void main(String[] args) {

		int int_value = (Integer.MAX_VALUE + 1);

		System.out.println("int values in binary format : " + intToString(-1, 8));
	}

	/**
	 * Converts an integer to a 32-bit binary string
	 * 
	 * @param number    The number to convert
	 * @param groupSize The number of bits in a group
	 * @return The 32-bit long bit string
	 */
	public static String intToString(int number, int groupSize) {
		StringBuilder result = new StringBuilder();

		for (int i = 31; i >= 0; i--) {
			int mask = 1 << i;
			result.append((number & mask) != 0 ? "1" : "0");

			if (i % groupSize == 0)
				result.append(" ");
		}
		result.replace(result.length() - 1, result.length(), "");

		return result.toString();
	}
}
