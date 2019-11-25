package com.java.basic.concept.algorithmBasicPractice.sort;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeSort {

	// Merge sort is the algorithm which follows divide and conquer approach.

	// 1.If A Contains 0 or 1 elements then it is already sorted, otherwise, DivideA
	// into two sub-array of equal number of elements.
	// 2. Conquer means sort the two sub-arrays recursively using the merge sort.
	// 3.Combine the sub-arrays to form a single final sorted array maintaining the
	// ordering of the array.

	public static void main(String args[]) {

		int arr[] = { 90, 23, 101, 45, 65, 23, 67, 89, 34, 23 };

		MyMergeSort ob = new MyMergeSort();
		ob.sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");

		IntStream intStream = Arrays.stream(arr);
		intStream.forEach(x -> System.out.print(x + ","));
	}
}

class MyMergeSort {

	void merge(int arr[], int beg, int mid, int end) {

		int l = mid - beg + 1;
		int r = end - mid;

		int LeftArray[] = new int[l];
		int RightArray[] = new int[r];

		for (int i = 0; i < l; ++i)
			LeftArray[i] = arr[beg + i];

		for (int j = 0; j < r; ++j)
			RightArray[j] = arr[mid + 1 + j];

		int i = 0, j = 0;
		int k = beg;

		while (i < l && j < r) {
			if (LeftArray[i] <= RightArray[j]) {
				arr[k] = LeftArray[i];
				i++;
			} else {
				arr[k] = RightArray[j];
				j++;
			}
			k++;
		}

		while (i < l) {
			arr[k] = LeftArray[i];
			i++;
			k++;
		}

		while (j < r) {
			arr[k] = RightArray[j];
			j++;
			k++;
		}

	}

	// Sorted array
	// {23,23,23,34,45,65,67,89,90,101}

	void sort(int arr[], int beg, int end) {
		if (beg < end) {
			int mid = (beg + end) / 2;
			sort(arr, beg, mid);
			sort(arr, mid + 1, end);
			merge(arr, beg, mid, end);
		}
	}
}
