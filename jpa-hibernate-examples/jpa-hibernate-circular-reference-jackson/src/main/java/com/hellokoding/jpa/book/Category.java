package com.hellokoding.jpa.book;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(exclude = "books")
@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@SequenceGenerator(sequenceName = "Category_Sequence", name = "CATEGORY_SEQ", allocationSize = 1, initialValue = 1)
	private int id;

	private String name;

	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("category")
	private Set<Book> books;

}
