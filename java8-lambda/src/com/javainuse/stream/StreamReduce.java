package com.javainuse.stream;

import java.util.stream.IntStream;

public class StreamReduce {

	public static void main(String[] args) {
		int result = IntStream.of(1, 2, 3, 4).reduce(4, (a, b) -> a + b);
		System.out.println(result);
	}

}
