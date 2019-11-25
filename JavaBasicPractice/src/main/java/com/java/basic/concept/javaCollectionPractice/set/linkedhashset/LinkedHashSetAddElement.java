package com.java.basic.concept.javaCollectionPractice.set.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetAddElement {

	// Java LinkedHashSet class contains unique elements only like HashSet.
	// Java LinkedHashSet class provides all optional set operation and permits null
	// elements.
	// Java LinkedHashSet class is non synchronized.
	// Java LinkedHashSet class maintains insertion order.
	// LinkedHashSet class extends HashSet class.

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add(null);
		set.add("Four");
		set.add("Five");
		set.add("Two");
		set.add(null);

		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
