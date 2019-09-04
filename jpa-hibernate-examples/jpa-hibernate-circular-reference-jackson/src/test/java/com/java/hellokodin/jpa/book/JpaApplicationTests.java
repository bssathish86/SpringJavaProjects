package com.java.hellokodin.jpa.book;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hellokoding.jpa.JpaApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JpaApplication.class)
public class JpaApplicationTests {

	public static final Logger logger = LoggerFactory.getLogger(JpaApplicationTests.class);

	@Test
	public void contextLoads() {
	}
/*
	@Autowired
	private AuthorRepository authorRepository;

	@Autowired
	private BookPublisherRepository bookPublisherRepository;

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private PublisherRepository publisherRepository;

	*//**
	 * 
	 *//*
	@Test
	public void whenFindByName_thenReturnBook() {
		logger.info("when FindByName then Return Book:");
		// given

		Category bookCate = new Category("General");
		Book bookA = new Book("Book A", "this book using for test");
		Book bookB = new Book("Book B", "this book using for test");

		bookA.setCategory(bookCate);
		bookB.setCategory(bookCate);

		bookRepository.save(bookA);

		Author author = new Author("Raam");
		author.setBooks(new HashSet<Book>() {
			{
				add(bookA);
				add(bookB);
			}
		});
		
		authorRepository.save(author);
		
		
		// then
	}*/
}
