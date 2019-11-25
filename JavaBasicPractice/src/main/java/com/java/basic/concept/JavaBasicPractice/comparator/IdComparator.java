package com.java.basic.concept.JavaBasicPractice.comparator;

import java.util.Comparator;

public class IdComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		if (o1.getId() > o2.getId()) {
			return 1;
		} else if (o1.getId() < o2.getId()) {
			return -1;
		} else {
			return 0;
		}
	}

}
