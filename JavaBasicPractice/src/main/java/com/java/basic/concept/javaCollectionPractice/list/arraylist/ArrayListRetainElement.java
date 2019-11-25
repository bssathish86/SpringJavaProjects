package com.java.basic.concept.javaCollectionPractice.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRetainElement {

	// Retains only the elements in this list that are contained in the specified
	// collection. In other words, removes from this list all of its elements that
	// are not contained in the specified collection.

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");

		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Ravi");
		al2.add("Ajay");
		// al2.add("Hanumat");

		al.retainAll(al2);
		System.out.println("iterating the elements after retaining the elements of al2");

		Iterator<String> itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
