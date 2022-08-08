package com.library.models;

public class Book {

	private BookTitle bookTitle;
	private int id;

	public Book(BookTitle bookTitle, int id) {
		this.bookTitle = bookTitle;
		this.id = id;
	}

	public BookTitle getBookTitle() {
		return bookTitle;
	}

	public String getTitle() {
		return getBookTitle().getTitle();
	}

	public void setTitle(String title) {
		this.getBookTitle().setTitle(title);
	}

	public Author getAuthor() {
		return getBookTitle().getAuthor();
	}

	public void setAuthor(Author author) {
		this.getBookTitle().setAuthor(author);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
