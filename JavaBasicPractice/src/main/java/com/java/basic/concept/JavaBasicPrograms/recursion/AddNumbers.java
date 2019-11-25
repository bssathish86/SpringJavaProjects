package com.java.basic.concept.JavaBasicPrograms.recursion;

public class AddNumbers {

	public static void main(String[] args) {

		int[] arrNums = { 1, 2, 3, 4, 5, 6 };
		System.out.println(addNumbers(arrNums, arrNums.length));
	}

	private static int addNumbers(int[] arrNums, int n) {

		if (n == 0)
			return 0;
		return addNumbers(arrNums, n - 1) + arrNums[n - 1];
	}
}
