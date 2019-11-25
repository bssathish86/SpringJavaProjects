package com.java.basic.concept.javaCollectionPractice.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapAddElement {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(null, "Ram");
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		map.put(null, "Ram");
		map.put(103, null);
		map.put(null, null);

		// Elements can traverse in any order
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
