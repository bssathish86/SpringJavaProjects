package com.java.basic.concept.javaCollectionPractice.set.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetFromArrayList {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");

		Set<String> set = new HashSet<String>(list);
		set.add("Gaurav");

		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
