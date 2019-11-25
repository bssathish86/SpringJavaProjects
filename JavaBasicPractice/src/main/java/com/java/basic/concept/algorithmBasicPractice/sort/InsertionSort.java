package com.java.basic.concept.algorithmBasicPractice.sort;

import java.util.Arrays;
import java.util.stream.IntStream;

public class InsertionSort {

	/*
	 * java program to sort array elements using insertion sort. Insertion is good
	 * for small elements only because it requires more time for sorting large
	 * number of elements.
	 */

	public static void main(String[] args) {

		int[] intArr = { 9, 14, 3, 2, 43, 11, 58, 22 };
		IntStream intStream = Arrays.stream(insertionSort(intArr));
		intStream.forEach(x -> System.out.print(x + ","));
	}

	// Before Insertion Sort
	// 9 14 3 2 43 11 58 22
	// After Insertion Sort
	// 2 3 9 11 14 22 43 58

	// using Array
	public static int[] insertionSort(int[] list) {
		int i, j, key, temp;
		for (i = 1; i < list.length; i++) {
			key = list[i];
			j = i - 1;
			while (j >= 0 && key < list[j]) {
				temp = list[j];
				list[j] = list[j + 1];
				list[j + 1] = temp;
				j--;
			}
		}
		return list;
	}
}
