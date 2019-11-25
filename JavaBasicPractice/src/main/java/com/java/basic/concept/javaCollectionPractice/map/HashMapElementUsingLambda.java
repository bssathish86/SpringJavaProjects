package com.java.basic.concept.javaCollectionPractice.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HashMapElementUsingLambda {

	public static void main(String[] args) {

		compareMapData();
		revereseMapData();
	}

	private static void compareMapData() {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");

		// Returns a Set view of the mappings contained in this map
		map.entrySet()
				// Returns a sequential Stream with this collection as its source
				.stream()
				// Sorted according to the provided Comparator
				.sorted(Map.Entry.comparingByKey())
				// Performs an action for each element of this stream
				.forEach(System.out::println);
	}

	private static void revereseMapData() {

		Map<Integer, String> revmap = new HashMap<Integer, String>();
		revmap.put(100, "Amit");
		revmap.put(101, "Vijay");
		revmap.put(102, "Rahul");

		// Returns a Set view of the mappings contained in this map
		revmap.entrySet()
				// Returns a sequential Stream with this collection as its source
				.stream()
				// Sorted according to the provided Comparator
				.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				// Performs an action for each element of this stream
				.forEach(System.out::println);
	}
}