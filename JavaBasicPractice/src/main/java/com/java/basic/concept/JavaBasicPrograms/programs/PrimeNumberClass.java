package com.java.basic.concept.JavaBasicPrograms.programs;

import java.util.ArrayList;

public class PrimeNumberClass {

	public static void main(String[] args) {

		ArrayList<Integer> primeList = new ArrayList<>();

		int max = 10000;
		for (int x = 2; x <= max; x++) {
			boolean isPrime = true;
			for (int y = 2; y < x; y++)
				if (x % y == 0) {
					isPrime = false;
					break;
				}
			if (isPrime)
				primeList.add(x);
		}
		System.out.println(primeList);
	}
}
