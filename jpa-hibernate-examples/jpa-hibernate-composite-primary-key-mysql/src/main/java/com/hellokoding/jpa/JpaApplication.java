package com.hellokoding.jpa;

import java.util.Arrays;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.hellokoding.jpa.book.Book;
import com.hellokoding.jpa.book.BookRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j

@SpringBootApplication
class JpaApplication {

	private static final Logger logger = LoggerFactory.getLogger(JpaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(BookRepository bookRepository) {
		return r -> {
			// Create a couple of Book
			bookRepository.saveAll(
					Arrays.asList(new Book("Hello Koding 1", new Date()), new Book("Hello Koding 2", new Date())));

			// Fetch all
			logger.info("My books: " + bookRepository.findAll());
		};
	}
}
