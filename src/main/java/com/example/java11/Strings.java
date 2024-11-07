package com.example.java11;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Strings {

	public static void main(String[] args) {

		// String enhancements


		// new method: isBlank
		log.info("Is blank 1: {}", "Vader".isBlank());
		log.info("Is blank 2: {}", "".isBlank());
		log.info("Is blank 3: {}", "  ".isBlank());


		// new method: lines
		"Va\nder".lines().forEach(log::info);


		// new method: strip
		log.info("Stripped 1: [{}]", "  Vader  ".strip());
		log.info("Stripped 2: [{}]", "  Vader  ".stripLeading());
		log.info("Stripped 3: [{}]", "  Vader  ".stripTrailing());


		// new method: repeat
		log.info("Repeat: {}", "Vader ".repeat(3));
	}
}
