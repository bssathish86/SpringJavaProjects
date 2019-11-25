package com.java.basic.concept.algorithmBasicPractice.sort;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class QuickSort {

	public static void main(String[] args) {

		QuickSort qs = new QuickSort();
		int[] intArr = { 9, 0, 1, 3, 4, 5, 2, 9, 8, 7, 6, 5, 9, 1, 0, 9 };

		System.out.println(Arrays.toString(intArr));
		qs.quickSort(intArr);

		System.out.println("\nSorted array");
		IntStream intStream = Arrays.stream(intArr);
		intStream.forEach(x -> System.out.print(x + ","));
	}

	public void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}

	private void quickSort(int[] arr, int low, int high) {
		if (low < high + 1) {
			int p = partition(arr, low, high);
			quickSort(arr, low, p - 1);
			quickSort(arr, p + 1, high);
		}
	}

	private void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	// returns random pivot index between low and high inclusive.
	private int getPivot(int low, int high) {
		Random rand = new Random();
		return rand.nextInt((high - low) + 1) + low;
	}

	// moves all n < pivot to left of pivot and all n > pivot
	// to right of pivot, then returns pivot index.
	private int partition(int[] arr, int low, int high) {

		swap(arr, low, getPivot(low, high));
		int border = low + 1;

		for (int i = border; i <= high; i++) {
			if (arr[i] < arr[low]) {
				swap(arr, i, border++);
			}
		}

		swap(arr, low, border - 1);
		return border - 1;
	}
}
