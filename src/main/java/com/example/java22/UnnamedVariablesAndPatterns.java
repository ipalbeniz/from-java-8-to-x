package com.example.java22;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UnnamedVariablesAndPatterns {

	public static void main(final String[] args) {

		try {
			// ...
		} catch (RuntimeException _) {
			log.error("Something went wrong!");
		}


		String message = IntStream.range(0, 16)
			.mapToObj(_ -> "na")
			.collect(Collectors.joining(", "));

		log.info(message + "... Batman!");


		Object object = new Person("Jinx", 15);

		if (object instanceof Person(_, int age)) {
			log.info("Age: {}", age);
		}


		// More info:
		// - https://openjdk.org/jeps/456
		// - https://www.baeldung.com/java-unnamed-patterns-variables
	}

	record Person(String fullname, int age) {}
}