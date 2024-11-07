package com.example.java16;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PatternMatchingInstanceOf {

	public static void main(final String[] args) {

		// old way
		Number myNumber = provideNumber();

		if (myNumber instanceof Integer) {

			Integer myInteger = (Integer) myNumber;
			log.info("Integer: {}", myInteger);

		} else if (myNumber instanceof Double) {

			Double myDouble = (Double) myNumber;
			log.info("Double: {}", myDouble);

		} else {

			log.error("Unknown number type: {}", myNumber);
		}


		// Pattern matching for instanceof (type pattern)
		myNumber = provideNumber();

		if (myNumber instanceof Integer myInteger) {

			log.info("Integer: {}", myInteger);

		} else if (myNumber instanceof Double myDouble) {

			log.info("Double: {}", myDouble);

		} else {

			log.error("Unknown number type: {}", myNumber);
		}


		// More info:
		// - https://openjdk.org/jeps/394
		// - https://www.baeldung.com/java-pattern-matching-instanceof
	}

	private static Number provideNumber() {

		return Integer.valueOf(42);
//		return Double.valueOf(12.34);
//		return Long.valueOf(999);
	}
}
