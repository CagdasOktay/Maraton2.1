package com.library.models;

public class Author {

	private static int nextAuthorId = 0;

	private String name;
	private int id;

	public Author(String name) {
		this.name = name;
		id = nextAuthorId;
		nextAuthorId++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
