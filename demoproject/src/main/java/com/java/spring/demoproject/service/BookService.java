package com.java.spring.demoproject.service;

import java.util.List;

import com.java.spring.demoproject.dto.SearchDTO;
import com.java.spring.demoproject.model.Book;

public interface BookService {

	List<Book> search(SearchDTO searchCriteria);

	Book findById(Long id);

	List<Book> findByName(String title);

	List<Book> findByTitle(String title);

	List<Book> findByAuthor(String author);

	List<Book> findAllBooks();

	Book saveBook(Book book);

	Book updateBook(Book book);

	void deleteBookById(Long id);

	void deleteAllBooks();

	boolean isBookExist(Book book);
}
