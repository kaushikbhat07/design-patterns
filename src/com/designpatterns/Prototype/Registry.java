package com.designpatterns.Prototype;

public class Registry {
	public static class ModelType {
		public static final String MOVIE = "MOVIE";
		public static final String BOOK = "BOOK";
	}

	private static final java.util.Map<String , Item> prototypes = new java.util.HashMap<>();

	static {
		prototypes.put(ModelType.MOVIE, new Movie("TemplateMovie"));
		prototypes.put(ModelType.BOOK, new Book("TemplateBook"));
	}

	public static Item getInstance(final String item) throws CloneNotSupportedException {
		return prototypes.get(item).clone();
	}
}
