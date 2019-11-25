package com.java.basic.concept.JavaBasicPractice.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getName().compareToIgnoreCase(o2.getName());
	}
}
