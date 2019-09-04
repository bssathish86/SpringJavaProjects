package com.java.spring.demoproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.java.spring.demoproject.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

	List<Book> findByTitle(String title);

	List<Book> findByAuthor(String author);

	List<Book> findByName(String title);

	@Query("SELECT b FROM Book b WHERE LOWER(b.title) = LOWER(:title)")
	List<Book> find(@Param("title") String title);

}
