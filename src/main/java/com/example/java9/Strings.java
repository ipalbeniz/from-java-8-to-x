package com.example.java9;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Strings {

	public static void main(String[] args) {

		// new method: chars
		"Vader".chars()
			.forEach(character -> log.info("Char: {}", (char) character));
	}
}
