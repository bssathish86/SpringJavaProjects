package com.hellokoding.jpa.book;

import lombok.*;

import javax.persistence.*;

@Data

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToOne(mappedBy = "book", cascade = CascadeType.ALL)
    private BookDetail bookDetail;

    public Book(String name, BookDetail bookDetail) {
        this.name = name;
        this.bookDetail = bookDetail;
        this.bookDetail.setBook(this);
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

	public BookDetail getBookDetail() {
		return bookDetail;
	}

	public void setBookDetail(BookDetail bookDetail) {
		this.bookDetail = bookDetail;
	}
    
}
