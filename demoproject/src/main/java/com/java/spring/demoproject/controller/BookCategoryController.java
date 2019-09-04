package com.java.spring.demoproject.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.java.spring.demoproject.exception.CustomException;
import com.java.spring.demoproject.model.BookCategory;
import com.java.spring.demoproject.service.BookCategoryService;

@RestController
@RequestMapping("/api")
public class BookCategoryController {

	public static final Logger logger = LoggerFactory.getLogger(BookCategoryController.class);

	@Autowired
	private BookCategoryService bookCategoryService;

	@PostMapping("/bookcates")
	@Transactional
	public ResponseEntity<?> createBookCategory(@RequestBody BookCategory bookCategory,
			UriComponentsBuilder ucBuilder) {
		logger.info("Creating a new book category detail: {}", bookCategory);

		if (bookCategoryService.isBookExist(bookCategory)) {
			logger.error("Unable to create. a book category with name {} already exist", bookCategory.getName());
			return new ResponseEntity<>(
					new CustomException(
							"Unable to create a book with name " + bookCategory.getName() + " already exist."),
					HttpStatus.CONFLICT);
		}

		bookCategoryService.save(bookCategory);

		final HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/bookcate/{id}").buildAndExpand(bookCategory.getId()).toUri());
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	}

	@GetMapping("/bookcates")
	public ResponseEntity<List<BookCategory>> listAllBooks() {
		logger.info("Listing all book category details ");

		final List<BookCategory> bookCategorys = bookCategoryService.findAllBookCategory();

		if (bookCategorys.isEmpty())
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(bookCategorys, HttpStatus.OK);
	}

}
