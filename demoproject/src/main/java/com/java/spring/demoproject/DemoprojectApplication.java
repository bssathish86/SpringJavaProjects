package com.java.spring.demoproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.spring.demoproject.service.BookService;

@RestController
@SpringBootApplication
public class DemoprojectApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(DemoprojectApplication.class);

	@Value("${spring.application.name}")
	private String name;

	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		logger.info("this is a info message");
		logger.warn("this is a warn message");
		logger.error("this is a error message");
		SpringApplication.run(DemoprojectApplication.class, args);
	}

	@RequestMapping(value = "/")
	public String hello() {
		return "Hello spring boot World ";
	}

	@RequestMapping(value = "/name")
	public String name() {
		return name;
	}

	@Override
	public void run(String... args) throws Exception {
		bookService.findAllBooks().forEach(book -> {
			System.out.println(book);
		});
	}
}
