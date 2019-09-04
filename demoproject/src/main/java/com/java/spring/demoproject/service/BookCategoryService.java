package com.java.spring.demoproject.service;

import java.util.List;

import com.java.spring.demoproject.model.BookCategory;

public interface BookCategoryService {

	boolean isBookExist(BookCategory bookCategory);

	void save(BookCategory bookCategory);

	List<BookCategory> findAllBookCategory();
}
