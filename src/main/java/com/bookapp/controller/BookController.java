package com.bookapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.bean.Book;
import com.bookapp.exception.BookNotFoundException;
import com.bookapp.service.BookService;

@RestController
//@CrossOrigin(origins="http://127.0.0.1:5500")
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/book-app")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllBooks() {
		List<Book> BookList = bookService.getAllBooks();
		return ResponseEntity.ok(BookList) ;
	}	
	@GetMapping("/book-by-category/{category}")
	public ResponseEntity<List<Book>> getBookByCategory(@PathVariable("category")String category) throws BookNotFoundException
	{
		List<Book> bookList=bookService.getBookbyCategory(category);
		HttpHeaders http= new HttpHeaders();
		http.add("desc", "Getting details");
		return ResponseEntity.status(HttpStatus.ACCEPTED).headers(http).body(bookList);
	}
	@GetMapping("/book-by-author/{author}")
	public ResponseEntity<List<Book>> getBookByAuthor(@PathVariable("author")String author) throws BookNotFoundException
	{
		List<Book> bookList=bookService.getBookbyAuthor(author);
		HttpHeaders http= new HttpHeaders();
		http.add("desc", "Getting details");
		return ResponseEntity.status(HttpStatus.ACCEPTED).headers(http).body(bookList);
	}
	
	@GetMapping("/book-by-id/{bookid}")
	public  ResponseEntity<Book> getBookById(@PathVariable("bookid")int bookid) throws BookNotFoundException {
		Book bookList = bookService.getBookById(bookid);
		HttpHeaders header = new HttpHeaders();
		header.add("desc", "Getting books by bookid");
		header.add("content", "book data");
		return ResponseEntity.status(HttpStatus.CREATED).headers(header).body(bookList);
	}
	
  @PostMapping("/add")
//	@PostMapping(value = "/add", consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> addBook(@RequestBody Book book) {
		bookService.addBook(book);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@DeleteMapping("/delete-book/{bookid}")  
	public ResponseEntity<Boolean> deleteBook(@PathVariable("bookid") int bookid) throws BookNotFoundException {
		bookService.deleteBook(bookid);
		return new ResponseEntity<Boolean>(HttpStatus.OK);

    }
//	@ExceptionHandler(BookNotFoundException.class)
//	public ResponseEntity<String> handleIdException(BookNotFoundException e){
//		String message=  e.getMessage();
//		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Not Found");
//	}
}