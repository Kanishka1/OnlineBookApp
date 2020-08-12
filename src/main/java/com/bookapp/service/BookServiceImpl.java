package com.bookapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.bean.Book;
import com.bookapp.dao.BookDAO;
import com.bookapp.exception.BookNotFoundException;

@Service
public class BookServiceImpl implements BookService{
	public String msg;
	@Autowired
	BookDAO bookDAO ;

	public void addBook(Book book) {
		bookDAO.save(book);
	}
//	public void addBook(Iterable<Book> book) {
//	List<Book>bookList=bookDAO.saveAll(book);
//}

	public boolean deleteBook(Integer bookid) throws BookNotFoundException 
	{
		bookDAO.deleteById(bookid);
		return true;
	};


	public Book updateBook(Book book) {
		return  bookDAO.save(book);
		
	}

	public List<Book> getAllBooks() 
	{
		return bookDAO.findAll();
	}

	public List<Book> getBookbyAuthor(String author) throws BookNotFoundException {
		List<Book> booklist=bookDAO.findByAuthor(author);
		if(booklist.isEmpty())
		{
			msg= "Book with author name "+author+"not found";
			throw new BookNotFoundException(msg);
		}
		return booklist;
	}

	public List<Book> getBookbyCategory(String category) throws BookNotFoundException {
		
		List<Book> booklistbycat=bookDAO.findByCategory(category);
		if(booklistbycat.isEmpty())
		{
			msg="Book with author name "+category+"not found";
			throw new BookNotFoundException(msg);
		}
		return booklistbycat;
	}

	@Override
	public Book getBookById(Integer bookid) throws BookNotFoundException 
	{
		return bookDAO.findById(bookid)
		    .orElseThrow(()-> new BookNotFoundException("Invalid id"));
	}






}
