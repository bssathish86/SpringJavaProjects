package com.hellokoding.jpa.book;

import lombok.Data;

import javax.persistence.*;

@Data

@Entity
public class BookDetail {
    @Id
    private Integer id;

    @OneToOne
    @JoinColumn
    @MapsId
    private Book book;

    private int numberOfPages;

    public BookDetail(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
}
