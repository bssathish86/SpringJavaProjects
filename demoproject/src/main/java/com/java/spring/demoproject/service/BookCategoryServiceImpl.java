package com.java.spring.demoproject.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.spring.demoproject.model.BookCategory;
import com.java.spring.demoproject.repository.BookCategoryRepository;

@Service
public class BookCategoryServiceImpl implements BookCategoryService {

	public static final Logger logger = LoggerFactory.getLogger(BookCategoryServiceImpl.class);

	@Autowired
	private BookCategoryRepository bookCategoryRepository;

	@Override
	public boolean isBookExist(BookCategory bookCategory) {
		return false;
	}

	@Override
	public void save(BookCategory bookCategory) {
		logger.info("Save book category : " + bookCategory);

		bookCategoryRepository.save(bookCategory);
	}

	@Override
	public List<BookCategory> findAllBookCategory() {
		return bookCategoryRepository.findAll();
	}
}
