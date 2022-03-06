package com.designpatterns.Prototype;

public class Book implements Item {
	private String name;

	public Book(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Book clone() throws CloneNotSupportedException {
		System.out.println("Cloning Book object..");
		return (Book) super.clone();
	}

	@Override
	public String toString() {
		return "BOOK";
	}
}
