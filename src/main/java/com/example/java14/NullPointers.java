package com.example.java14;

public class NullPointers {

	public static void main(String[] args) {

		// Java 14 introduces a new way to handle NullPointerExceptions

		String name = null;
		System.out.println(name.length());


		// More info:
		// - https://openjdk.org/jeps/358
		// - https://www.baeldung.com/java-14-nullpointerexception
	}
}
