package com.java.basic.concept.javaCollectionPractice.set.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetAddElement {

	// TreeSet class contains unique elements only like HashSet.
	// TreeSet class access and retrieval times are quiet fast.
	// TreeSet class doesn't allow null element.
	// TreeSet class maintains ascending order.

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Ravi");
		ts.add("Vijay");
		ts.add("Ravi");
		ts.add("Ajay");
		// Exception in thread "main" java.lang.NullPointerException
		//ts.add(null);

		// Traversing elements
		Iterator<String> itr = ts.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
