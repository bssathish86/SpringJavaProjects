package com.java.basic.concept.JavaBasicPractice.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorClassUsingLambda {

	public static void main(String[] args) {

		ArrayList<Book> al = new ArrayList<Book>();

		// Creating Books
		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
		Book b3 = new Book(121, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b4 = new Book(999, null, "Forouzan", "Mc Graw Hill", 4);

		// Adding Books to TreeSet
		al.add(b1);
		al.add(b2);
		al.add(b3);
		al.add(b4);

		Comparator<Book> cm = Comparator.comparing(Book::getId);
		Collections.sort(al, cm);
		System.out.println("Considers null to be less than non-null");

		for (Book bk : al) {
			System.out.println(bk);
		}

		Comparator<Book> cm1 = Comparator.comparing(Book::getName, Comparator.nullsFirst(String::compareTo));
		Collections.sort(al, cm1);
		System.out.println("Considers null to be less than non-null");

		for (Book bk : al) {
			System.out.println(bk);
		}
		Comparator<Book> cm2 = Comparator.comparing(Book::getName, Comparator.nullsLast(String::compareTo));
		Collections.sort(al, cm2);
		System.out.println("Considers null to be greater than non-null");
		for (Book bk : al) {
			System.out.println(bk);
		}
	}
}
