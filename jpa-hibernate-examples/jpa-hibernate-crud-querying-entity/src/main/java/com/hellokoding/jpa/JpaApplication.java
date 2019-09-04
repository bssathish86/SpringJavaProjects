package com.hellokoding.jpa;

import com.hellokoding.jpa.book.CategoryService;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@SpringBootApplication
public class JpaApplication implements CommandLineRunner {

	@Autowired
	private CategoryService categoryService;

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Override
	public void run(String... args) {
		categoryService.createCategory();
		categoryService.testSortingAssociatedCollectionWithOrderBy();
	}
}
