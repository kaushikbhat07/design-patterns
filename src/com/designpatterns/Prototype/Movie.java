package com.designpatterns.Prototype;

public class Movie implements Item {
	private String name;

	public Movie(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Movie clone() throws CloneNotSupportedException {
		System.out.println("Cloning Movie object..");
		return (Movie) super.clone();
	}

	@Override
	public String toString() {
		return "MOVIE";
	}
}