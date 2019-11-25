package com.java.basic.concept.JavaBasicPractice.comparable;

public class Book implements Comparable<Book> {

	public Book() {
		super();
	}

	private int id;
	private String name, author, publisher;
	private int quantity;

	public Book(int id, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	@Override
	public int compareTo(Book b) {
		if (id > b.id) {
			return 1;
		} else if (id < b.id) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return String.format("Book [id=%s, name=%s, author=%s, publisher=%s, quantity=%s]", id, name, author, publisher,
				quantity);
	}
}
