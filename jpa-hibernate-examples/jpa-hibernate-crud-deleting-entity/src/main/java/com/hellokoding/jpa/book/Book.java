package com.hellokoding.jpa.book;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@ToString(exclude = "category")

@Entity
public class Book {

	public Book() {
		super();
	}

	public Book(@NonNull String name) {
		super();
		this.name = name;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private @NonNull String name;

	@ManyToOne
	@JoinColumn
	private Category category;

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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Book))
			return false;
		Book book = (Book) o;
		return Objects.equals(name, book.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}
