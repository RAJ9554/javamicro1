package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entity.Book;
import com.example.repository.BookRepository;

@SpringBootApplication
public class Ebookstoreapp3Application implements CommandLineRunner {

	@Autowired
	@Qualifier(value="BookRepository")
	private BookRepository bookRepository;
	public static void main(String[] args) {
		SpringApplication.run(Ebookstoreapp3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		bookRepository.save(new Book(null, "SampleTitle1", "SamplePublisher1", "1234567890", "200", "2022"));
		bookRepository.save(new Book(null, "SampleTitle2", "SamplePublisher2", "1234567890", "201", "2021"));
		bookRepository.save(new Book(null, "SampleTitle3", "SamplePublisher3", "1234567890", "202", "2020"));
		
		
	}

}

