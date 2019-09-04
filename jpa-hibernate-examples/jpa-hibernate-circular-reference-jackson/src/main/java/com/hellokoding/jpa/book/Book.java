package com.hellokoding.jpa.book;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(exclude = { "category", "authors", "bookPublishers" })
@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@SequenceGenerator(sequenceName = "Book_Sequence", name = "BOOK_SEQ", allocationSize = 1, initialValue = 1)
	private int id;

	private String title;

	private String description;

	@ManyToOne
	@JoinColumn(name = "category_id")
	@JsonIgnoreProperties("books")
	private Category category;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "book_author", joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "author_id", referencedColumnName = "id"))
	@JsonIgnoreProperties("books")
	private Set<Author> authors;

	@OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnoreProperties("book")
	private Set<BookPublisher> bookPublishers = new HashSet<>();

}
