package com.bookapp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bookapp.bean.Book;
@Repository
public interface BookDAO extends MongoRepository<Book, Integer> { 
    List<Book> findByAuthor(String author); 
    List<Book> findByCategory(String category);
//	void deleteById(Integer bookid);
	//Optional<Book> findById(Integer bookid); 

     
} 
