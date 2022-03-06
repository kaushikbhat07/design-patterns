package com.designpatterns.Prototype;

public class PrototypeDemo {
	public static void main(String[] args) {
		try {
			// Instantiate 'n' movies without 'new'
			for (int i = 0; i < 2; i++) {
				Movie movie = (Movie) Registry.getInstance(Registry.ModelType.MOVIE);
				movie.setName("Movie #" + i);
				System.out.println(movie.getName());
			}

			// Instantiate 'n' books without 'new'
			for (int i = 0; i < 10; i++) {
				Book book = (Book) Registry.getInstance(Registry.ModelType.BOOK);
				book.setName("Book #" + i);
				System.out.println(book.getName());
			}
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
