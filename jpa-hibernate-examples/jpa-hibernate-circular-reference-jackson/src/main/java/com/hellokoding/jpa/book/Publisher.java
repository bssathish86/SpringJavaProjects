package com.hellokoding.jpa.book;

import java.util.HashSet;
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
@EqualsAndHashCode(exclude = "bookPublishers")
@Entity
public class Publisher {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@SequenceGenerator(sequenceName = "Publisher_Sequence", name = "PUBLISHER_SEQ", allocationSize = 1, initialValue = 1)
	private int id;

	private String name;

	@OneToMany(mappedBy = "publisher", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnoreProperties("publisher")
	private Set<BookPublisher> bookPublishers = new HashSet<>();

}
