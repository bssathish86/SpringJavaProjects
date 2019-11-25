package com.java.basic.concept.algorithmBasicPractice.sort;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SelectionSort {

	// we search for the lowest element and arrange it to the proper location.
	// We swap the current element with the next lowest number.

	public static void main(String[] args) {

		int[] arr = { 25, 35, 45, 12, 65, 10 };

		IntStream intStream = Arrays.stream(selectionSort(arr));
		intStream.forEach(x -> System.out.print(x + ","));

	}

	public static int[] selectionSort(int[] list) {

		int i, j, minValue, minIndex, temp = 0;
		for (i = 0; i < list.length; i++) {
			minValue = list[i];
			minIndex = i;
			for (j = i; j < list.length; j++) {
				if (list[j] < minValue) {
					minValue = list[j];
					minIndex = j;
				}
			}
			if (minValue < list[i]) {
				temp = list[i];
				list[i] = list[minIndex];
				list[minIndex] = temp;
			}
		}
		return list;
	}
}
