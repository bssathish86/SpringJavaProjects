package com.java.basic.concept.javaCollectionPractice.list.arraylist;

import java.util.ArrayList;

public class ArrayListAddElement {

	// Java ArrayList class can contain duplicate elements.
	// Java ArrayList class maintains insertion order.
	// Java ArrayList allows random access because array works at the index basis.
	// In Java ArrayList class, manipulation is slow because a lot of shifting needs
	// to occur if any element is removed from the array list.

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Initial list of elements: " + al);

		// Adding elements to the end of the list
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		System.out.println("After invoking add(E e) method: " + al);

		// Adding an element at the specific position
		al.add(1, "Gaurav");
		System.out.println("After invoking add(int index, E element) method: " + al);
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Sonoo");
		al2.add("Hanumat");

		// Adding second list elements to the first list
		al.addAll(al2);
		System.out.println("After invoking addAll(Collection<? extends E> c) method: " + al);
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("John");
		al3.add("Rahul");

		// Adding second list elements to the first list at specific position
		al.addAll(1, al3);
		System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: " + al);
		System.out.println("Before ensureCapacity" + al.size());
		al.ensureCapacity(12);
		System.out.println("After ensureCapacity" + al.size());
		ArrayList<String> al4 = new ArrayList<String>();
		al4.add("1");
		al4.add("2");
		al4.add("3");
		al4.add("4");
		al4.add("5");
		al4.add("6");
		al4.add("7");
		al4.add("8");

		// Adding second list elements to the first list at specific position
		al.addAll(1, al4);
		System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: " + al);
	}
}
