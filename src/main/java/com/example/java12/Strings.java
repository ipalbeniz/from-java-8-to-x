package com.example.java12;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Strings {

	public static void main(String[] args) {

		// String enhancements


		// new method: transform
		String nameUpperCase = "Vader".transform(String::toUpperCase);
		log.info("Transform: {}", nameUpperCase);


		// new method: indent
		log.info("Indented: [{}]", "Vader".indent(5));
	}
}
