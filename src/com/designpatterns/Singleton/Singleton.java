package com.designpatterns.Singleton;

public class Singleton {
	// Lazy loading. Don't initialize instance unnecessarily. Initialize just once in getInstance().
	private static Singleton instance = null;

	// Don't let anyone else instantiate this class
	private Singleton() {

	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}

		return instance;
	}
}