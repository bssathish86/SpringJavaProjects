package com.hellokoding.jpa.book;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(exclude = "books")
@Entity
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@SequenceGenerator(sequenceName = "Author_Sequence",  name = "AUTHOR_SEQ", allocationSize = 1, initialValue = 1)
	private int id;

	private String name;

	@ManyToMany(mappedBy = "authors")
	@JsonIgnoreProperties("authors")
	private Set<Book> books;
	
}
