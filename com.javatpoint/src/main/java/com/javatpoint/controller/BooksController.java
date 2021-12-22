package com.javatpoint.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.dto.BookDto;
import com.javatpoint.model.Books;
import com.javatpoint.service.BookService;

@RestController
public class BooksController {

	@Autowired
	BookService bookService;

	@GetMapping("/books")
	public List<Books> getAllBooks() {
		return bookService.getAllBooks();
		
	}

	@GetMapping("/books/{bookId}")
	public Books getBook(@PathVariable("bookId") Long bookId) {
		return bookService.getBooksById(bookId);

	}

	@PostMapping("/books")
	public String saveBook(@RequestBody BookDto books) {
		bookService.save(books);
		return "Data saved successfully";

	}

	@DeleteMapping("/books")
	public void deleteBook(@RequestParam(required = false, value = "bookId") Long bookId) {
		bookService.delete(bookId);
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		
	}

	@PutMapping("/books/update")
	public String update(@RequestBody BookDto books, @RequestParam Long id) {
		bookService.update(books, id);
		return "Data Updated Successfully";
	}
	

}
