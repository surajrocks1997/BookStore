package com.example.bookStore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookStore.dto.BookDto;

@RestController
@RequestMapping(value = "/api/v1/books")
public class BookController {

	@GetMapping
	public ResponseEntity<List<BookDto>> getBooks() {
		BookDto book = new BookDto("My First Book Title");

		List<BookDto> books = new ArrayList<>();
		books.add(book);

		return ResponseEntity.ok(books);
	}

}
