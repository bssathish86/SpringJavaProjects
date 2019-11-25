package com.java.basic.concept.javaCollectionPractice.set.treeset;

import java.util.TreeSet;

public class TreeSetRemoveElement {

	public static void main(String[] args) {

		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(24);
		set.add(66);
		set.add(12);
		set.add(15);

		System.out.println("Values : " + set);
		System.out.println("Highest Value: " + set.pollFirst());
		System.out.println("Lowest Value: " + set.pollLast());
	}
}
