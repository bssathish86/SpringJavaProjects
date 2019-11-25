package com.java.basic.concept.jvavaEightPractice.basicprograms.streams.integer;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class IntegerClass {

	public static void main(String[] args) {

		// 1. Integer Stream
		IntStream.range(1, 10).forEach(System.out::print);
		System.out.println();

		// 2. Integer Stream with skip
		// IntStream.range(1, 10).skip(5).forEach(x -> System.out.print(x));
		IntStream.range(1, 10).skip(5).forEach(System.out::print);
		System.out.println();

		// 3. Integer Stream with sum
		System.out.println(IntStream.range(1, 5).sum());
		System.out.println();

		// 3. Integer Stream with sum
		System.out.println(IntStream.range(1, 5).sum());
		System.out.println();

		// 4. average of squares of an int array
		Arrays.stream(new int[] { 2, 4, 6, 8, 10 }).map(x -> x * x).average().ifPresent(System.out::println);

		// 5. Reduction - summary statistics
		IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10).summaryStatistics();
		System.out.println(summary);
	}
}
