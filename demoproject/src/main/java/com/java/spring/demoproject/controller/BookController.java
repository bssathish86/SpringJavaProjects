package com.java.spring.demoproject.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.java.spring.demoproject.exception.CustomException;
import com.java.spring.demoproject.model.Book;
import com.java.spring.demoproject.service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {

	public static final Logger logger = LoggerFactory.getLogger(BookController.class);

	@Autowired
	private BookService bookService;

	@PostMapping("/books")
	@Transactional
	public ResponseEntity<?> createBook(@RequestBody Book book, UriComponentsBuilder ucBuilder) {
		logger.info("Creating a new book detail: {}", book);

		if (bookService.isBookExist(book)) {
			logger.error("Unable to create. a book with name {} already exist", book.getTitle());
			return new ResponseEntity<>(
					new CustomException("Unable to create a book with name " + book.getTitle() + " already exist."),
					HttpStatus.CONFLICT);
		}

		bookService.saveBook(book);

		final HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/book/{id}").buildAndExpand(book.getId()).toUri());
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	}

	@GetMapping("/books")
	public ResponseEntity<List<Book>> listAllBooks() {
		logger.info("Listing all book details ");

		final List<Book> books = bookService.findAllBooks();

		if (books.isEmpty())
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(books, HttpStatus.OK);
	}

	@GetMapping("/book/name/{title}")
	public ResponseEntity<List<Book>> listBooksByName(@PathVariable("title") String title) {
		logger.info("Listing all book details based on title", title);

		final List<Book> books = bookService.findByName(title);

		if (books.isEmpty())
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(books, HttpStatus.OK);
	}

	@GetMapping("/book/title/{title}")
	public ResponseEntity<List<Book>> listBooksByTitle(@PathVariable("title") String title) {
		logger.info("Listing all book details based on title", title);

		final List<Book> books = bookService.findByTitle(title);

		if (books.isEmpty())
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(books, HttpStatus.OK);
	}

	@GetMapping("/book/auth/{author}")
	public ResponseEntity<List<Book>> listBooksByAuthor(@PathVariable("author") String author) {
		logger.info("Listing all book details based on author", author);

		final List<Book> books = bookService.findByAuthor(author);

		if (books.isEmpty())
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(books, HttpStatus.OK);
	}

	@PutMapping("/books/{id}")
	public ResponseEntity<?> updateBook(@PathVariable("id") long id, @RequestBody Book book) {
		logger.info("updating book details based on id {}", id);

		final Book currentBookt = bookService.findById(id);

		if (currentBookt == null) {
			logger.error("Unable to update. book with id {} not found.", id);
			return new ResponseEntity<>(new CustomException("Unable to upate. book with id " + id + " not found."),
					HttpStatus.NOT_FOUND);
		}

		currentBookt.setPages(book.getPages());
		currentBookt.setTitle(book.getTitle());

		bookService.updateBook(currentBookt);
		return new ResponseEntity<>(currentBookt, HttpStatus.OK);
	}

	@DeleteMapping("/books")
	public ResponseEntity<?> deleteAllBooksd() {
		logger.info("Fetching & Deleting all book details  ");

		final List<Book> books = bookService.findAllBooks();

		if (books == null) {
			logger.error("Unable to delete. book not found.");
			return new ResponseEntity<>(new CustomException("Unable to delete. book not found."), HttpStatus.NOT_FOUND);
		}

		bookService.deleteAllBooks();
		return new ResponseEntity<Book>(HttpStatus.NO_CONTENT);
	}

	@DeleteMapping("/books/{id}")
	public ResponseEntity<?> deleteBook(@PathVariable("id") long id) {
		logger.info("Fetching & Deleting book with id {}", id);

		final Book book = bookService.findById(id);
		if (book == null) {
			logger.error("Unable to delete. book with id {} not found.", id);
			return new ResponseEntity<>(new CustomException("Unable to delete. book with id " + id + " not found."),
					HttpStatus.NOT_FOUND);
		}

		bookService.deleteBookById(id);
		return new ResponseEntity<Book>(HttpStatus.NO_CONTENT);
	}
}
