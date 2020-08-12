package com.bookapp.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("books")
public class Book {
	String title, author,category;
	@Id
	Integer bookid;
	double price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String title, String author, String category, Integer bookid, double price) {
		super();
		this.title = title;
		this.author = author;
		this.category = category;
		this.bookid = bookid;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Integer getBookid() {
		return bookid;
	}
	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", category=" + category + ", bookid=" + bookid
				+ ", price=" + price + "]";
	}
}
