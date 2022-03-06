package com.designpatterns.Singleton;

public class SingletonDemo {
	public static void main(String[] args) throws InterruptedException {
		Runtime singleton = Runtime.getRuntime();
		Runtime singleton2 = Runtime.getRuntime();
		System.out.println(singleton);
		System.out.println(singleton2);

		long before = System.currentTimeMillis();
		System.out.println(Singleton.getInstance());
		System.out.println(Singleton.getInstance());

		Singleton singleton1 = Singleton.getInstance();
		System.out.println(singleton1);
		long after = System.currentTimeMillis();

		System.out.println(after - before);

		long before1 = System.currentTimeMillis();
		Singleton.getInstance();
		long after1 = System.currentTimeMillis();
		System.out.println(after1 - before1);

		long before2 = System.currentTimeMillis();
		Singleton.getInstance();
		long after2 = System.currentTimeMillis();
		System.out.println(after2 - before2);
	}
}
