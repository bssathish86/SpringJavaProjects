package com.java.spring.demoproject.model;

import java.io.Serializable;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author sathishkumar_s
 *
 */
@Data
@EqualsAndHashCode(exclude = "books")

@Entity
@Table(name = "book_category")
public class BookCategory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BookCategory() {
		super();
	}

	public BookCategory(String name) {
		super();
		this.name = name;
	}

	public BookCategory(String name, Set<Book> books) {
		super();
		this.name = name;
		this.books = books;
	}

	public BookCategory(String name, Book... books) {
		super();
		this.name = name;
		this.books = Stream.of(books).collect(Collectors.toSet());
		this.books.forEach(book -> book.setBookCategory(this));
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(sequenceName = "bookCateIdSeq", name = "BOOK_CATE_SEQ", allocationSize = 1, initialValue = 1)
	private long id;

	private String name;

	@OneToMany(mappedBy = "bookCategory", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Book> books;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
