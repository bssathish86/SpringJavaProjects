package com.java.basic.concept.algorithmBasicPractice.sort;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BubbleSort {

	/*
	 * array is traversed from first element to last element.Here, current element
	 * is compared with the next element. If current element is greater than the
	 * next element, it is swapped.
	 */

	public static void main(String[] args) {

		int[] intArr = { 3, 60, 35, 2, 45, 320, 5 };
		IntStream intStream = Arrays.stream(bubbleSort(intArr));
		intStream.forEach(x -> System.out.print(x + ","));
	}

	// Array Before Bubble Sort {3 60 35 2 45 320 5}
	// Array After Bubble Sort {2 3 5 35 45 60 320}

	public static int[] bubbleSort(int[] list) {
		int i, j, temp = 0;

		for (i = 0; i < list.length - 1; i++) {
			for (j = 0; j < list.length - 1 - i; j++) {
				if (list[j] > list[j + 1]) {
					temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}
		return list;
	}
}
