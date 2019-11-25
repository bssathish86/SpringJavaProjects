package com.java.basic.concept.JavaBasicPractice.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorClass {

	public static void main(String[] args) {

		ArrayList<Book> al = new ArrayList<Book>();

		// Creating Books
		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
		Book b3 = new Book(121, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);

		// Adding Books to TreeSet
		al.add(b1);
		al.add(b2);
		al.add(b3);

		// Traversing TreeSet
		for (Book b : al) {
			System.out.println(b);
		}
		System.out.println("Sorting by Name .. ");
		Collections.sort(al, new NameComparator());
		for (Book bk : al) {
			System.out.println(bk);
		}
		System.out.println("Sorting by BookId .. ");
		Collections.sort(al, new IdComparator());
		for (Book bk : al) {
			System.out.println(bk);
		}
	}
}
