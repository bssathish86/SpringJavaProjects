package com.java.spring.demoproject.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.spring.demoproject.dto.SearchDTO;
import com.java.spring.demoproject.eenum.SearchType;
import com.java.spring.demoproject.model.Book;
import com.java.spring.demoproject.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	public static final Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);

	@Autowired
	private BookRepository bookRepository;

	@Override
	public List<Book> search(SearchDTO searchCriteria) {
		logger.debug("Searching books with search criteria: " + searchCriteria);

		String searchTerm = searchCriteria.getSearchTerm();
		SearchType searchType = searchCriteria.getSearchType();

		if (searchType == null) {
			throw new IllegalArgumentException();
		}
		return findBooksBySearchType(searchTerm, searchType);
	}

	@Override
	public List<Book> findAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public Book findById(Long id) {
		List<Book> books = findAllBooks();
		if (books != null && books.size() > 0)
			for (Book book : books)
				if (book.getId() == id)
					return book;
		return null;
	}

	@Override
	public List<Book> findByTitle(String title) {
		return bookRepository.findByTitle(title);
	}

	@Override
	public List<Book> findByAuthor(String author) {
		return bookRepository.findByAuthor(author);
	}

	@Override
	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public Book updateBook(Book book) {
		return bookRepository.saveAndFlush(book);
	}

	@Override
	public void deleteBookById(Long id) {
		bookRepository.deleteById(id);
	}

	@Override
	public void deleteAllBooks() {
		bookRepository.deleteAll();
	}

	@Override
	public boolean isBookExist(Book book) {
		return findByName(book.getTitle()) != null;
	}

	private List<Book> findBooksBySearchType(String searchTerm, SearchType searchType) {
		List<Book> books;

		if (searchType == SearchType.METHOD_NAME) {
			logger.debug("Searching books by using method name query creation.");
			books = bookRepository.findByAuthor(searchTerm);

		} else if (searchType == SearchType.NAMED_QUERY) {
			logger.debug("Searching books by using named query");
			books = bookRepository.findByName(searchTerm);

		} else {
			logger.debug("Searching books by using query annotation");
			books = bookRepository.find(searchTerm);
		}
		return books;
	}

	@Override
	public List<Book> findByName(String title) {
		return bookRepository.findByName(title);
	}
}
