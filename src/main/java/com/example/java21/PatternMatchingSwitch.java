package com.example.java21;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PatternMatchingSwitch {

	public static void main(final String[] args) {

		// Pattern matching for switch
		Number myNumber = provideNumber();

		switch (myNumber) {
			case Integer myInteger -> log.info("Integer: {}", myInteger);
			case Double myDouble -> log.info("Double: {}", myDouble);
			case null -> log.error("null number");
			default -> log.error("default: {}", myNumber);
		}

		String response = provideResponse();
		switch (response) {
			case "y", "Y" -> log.info("yeah!");
			// Guard Pattern (with condition)
			case String s when s.equalsIgnoreCase("yes") -> log.info("yes!");
			case null -> log.error("¯\\_(ツ)_/¯");
			default -> log.error("ouch!");
		}

		// Does not cover all possible values
		Character character = provideCharacter();

		String quote = switch (character) {
			case DARTH_VADER -> "I am your father.";
			case LUKE -> "I have a bad feeling about this.";
			case LEIA -> "Aren't you a little short for a stormtrooper?";
		};

		log.info("quote: {}", quote);


		// More info:
		// - https://openjdk.org/jeps/441
		// - https://www.baeldung.com/java-switch-pattern-matching
	}

	private static Number provideNumber() {

		return Integer.valueOf(42);
//		return Double.valueOf(12.34);
//		return Long.valueOf(999);
	}

	private static String provideResponse() {

		return "yEs";
	}

	private static Character provideCharacter() {

		return Character.LEIA;
//		return Character.DARTH_VADER;
	}

	private enum Character {
		DARTH_VADER, LUKE, LEIA
	}
}
