package com.java.spring.demoproject;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.java.spring.demoproject.model.Book;
import com.java.spring.demoproject.model.BookCategory;
import com.java.spring.demoproject.repository.BookCategoryRepository;
import com.java.spring.demoproject.repository.BookRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoprojectApplicationTests {

	public static final Logger logger = LoggerFactory.getLogger(DemoprojectApplicationTests.class);

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private BookCategoryRepository bookCategoryRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void whenFindByName_thenReturnBook() {
		logger.info("when FindByName then Return Book:");
		// given

		BookCategory bookCate = new BookCategory("General");
		Book bookA = new Book("Book A", 1, "Ram", bookCate);
		Book bookB = new Book("Book B", 1, "Ram", bookCate);

		bookA.setBookCategory(bookCate);
		bookB.setBookCategory(bookCate);

		bookCategoryRepository.save(new BookCategory("General", bookA, bookB));

		// then
		// assertThat(bookCate1.getName()).isEqualTo(bookCate.getName());
	}

	@Test
	public void whenFindByName_thenReturnBookCategory() {
		logger.info("when FindByName then Return BookCategory:");
		// given

		BookCategory bookCate = new BookCategory("General");
		Book bookA = new Book("Book A", 1, "Ram", bookCate);
		Book bookB = new Book("Book B", 1, "Ram", bookCate);

		Set<Book> setBook = new HashSet<>();
		setBook.add(bookA);
		setBook.add(bookB);

		bookCate.setBooks(setBook);

		// bookCategoryRepository.save(bookCate);

		// when
		/*
		 * List<BookCategory> bookCates =
		 * bookCategoryRepository.findByName(bookCate.getName());
		 * 
		 * bookCates.forEach(bookCate1 ->
		 * bookCate1.getName().equals(bookCate.getName()));
		 * bookCates.forEach(System.out::println);
		 */

		// then
		// assertThat(bookCate1.getName()).isEqualTo(bookCate.getName());
	}

}
