package com.hellokoding.jpa.book;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
@NoArgsConstructor
@ToString(exclude = "books")

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Book> books;

	public Category(String name, Book... books) {
		this.name = name;
		this.books = Stream.of(books).collect(Collectors.toSet());
		this.books.forEach(x -> x.setCategory(this));
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Category))
			return false;
		Category category = (Category) o;
		return Objects.equals(name, category.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}
