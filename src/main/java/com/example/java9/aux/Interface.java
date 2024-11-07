package com.example.java9.aux;

public interface Interface {

	// java 8
	default void defaultMethod() {

		System.out.println("default method");
		privateMethod();
	}

	// java 9
	private void privateMethod() {

		System.out.println("private method");
	}

	// java 8
	static void defaultMethodStatic() {

		System.out.println("default method static");
		privateMethodStatic();
	}

	// java 9
	private static void privateMethodStatic() {

		System.out.println("private method static");
	}
}