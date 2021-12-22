package com.javatpoint.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatpoint.dto.BookDto;
import com.javatpoint.model.Books;
import com.javatpoint.repository.BooksRepository;

@Service
public class BookService {

	@Autowired
	BooksRepository booksRepository;

	public List<Books> getAllBooks() {
		List<Books> books = new ArrayList<Books>();
		booksRepository.findAll().forEach(books1 -> books.add(books1));
		return books;
	}

	public void save(BookDto books) {
		try {
			Books b = new ModelMapper().map(books, Books.class);
			booksRepository.save(b);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Books getBooksById(long bookId) {

		return booksRepository.findById(bookId).get();
	}

	public void delete(Long bookId) {
		if (bookId != null) {
			booksRepository.deleteById(bookId);
		} else {
			booksRepository.delete(booksRepository.findAll().get(0));
		}

	}

	public void update(BookDto books, long id) {
		try {

			Optional<Books> b1 = booksRepository.findById(id);

			if (b1.isPresent()) {
				Books book = b1.get();
				book.setAuthor(books.getAuthor());
				book.setBookName(books.getBookName());
				book.setPrice(books.getPrice());
				booksRepository.save(book);
			} else {
				System.out.println("Not present");
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
