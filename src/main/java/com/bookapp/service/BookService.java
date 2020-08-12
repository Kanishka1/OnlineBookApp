package com.bookapp.service;

import java.util.List;
import java.util.Optional;

import com.bookapp.bean.Book;
import com.bookapp.exception.BookNotFoundException;

public interface BookService {

		void addBook(Book book);
	    boolean deleteBook(Integer bookid) throws BookNotFoundException;
	    Book getBookById(Integer bookid) throws BookNotFoundException;
	    Book updateBook(Book book);
	    List<Book> getAllBooks();
	    List<Book> getBookbyAuthor(String author) throws BookNotFoundException;
	    List<Book> getBookbyCategory(String category)throws BookNotFoundException;
}

