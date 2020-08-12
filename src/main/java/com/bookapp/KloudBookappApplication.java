package com.bookapp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.bookapp.bean.Book;
import com.bookapp.service.BookService;

@SpringBootApplication
@ComponentScan("com.bookapp")
@EnableMongoRepositories("com.bookapp")
public class KloudBookappApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(KloudBookappApplication.class, args);
	}
	@Autowired
	BookService bookService;

	@Override
	public void run(String... args) throws Exception {
		Book book=new Book("Inception","Bianca","Fiction",1,800);
		bookService.addBook(book);
//		List<Book> booklist=bookService.getBookbyAuthor("Sachin");
//		List<Book> booklist2=bookService.getBookbyCategory("Novel");		
//		//bookService.updateBook(book);
		List<Book> allbooks=bookService.getAllBooks();
		//Book gtbook=bookService.getBookById("ObjectId(\"5f1af17e1456be70a0aad917\")");
		//System.out.println(gtbook);
		//bookService.deleteBook(8);
//		System.out.println(booklist);
//		System.out.println(booklist2);
		System.out.println(allbooks);
		//System.out.println(gtbook);
		
	}

}
