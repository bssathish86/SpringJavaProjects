package com.java.basic.concept.javaCollectionPractice.set.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetAddElement {

	// HashSet doesn't maintain the insertion order.
	// HashSet allows null value.
	// HashSet stores the elements by using a mechanism called hashing.
	// HashSet contains unique elements only.

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("One");
		set.add("Two");
		set.add(null);
		set.add("Three");
		set.add("Four");
		set.add("Five");
		set.add("One");
		set.add(null);

		Iterator<String> i = set.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
