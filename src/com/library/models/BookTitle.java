package com.library.models;

public class BookTitle {

	private String title;
	private Author author;
	private int id;

	public BookTitle(String title, Author author, int id) {
		this.title = title;
		this.author = author;
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
