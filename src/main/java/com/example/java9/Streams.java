package com.example.java9;

import java.util.stream.Stream;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Streams {

	public static void main(String[] args) {

		// new stream methods
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
			.takeWhile(number -> number < 3)
			.forEach(number -> log.info("takeWhile number: {}", number));


		Stream.of(1, 2, 3, 4, 5)
			.dropWhile(number -> number < 3)
			.forEach(number -> log.info("dropWhile number: {}", number));


		Stream.iterate(1, number -> number < 10, number -> number + 2)
			.forEach(number -> log.info("iterate number: {}", number));


		Stream.ofNullable(1)
			.forEach(number -> log.info("ofNullable number: {}", number));


		// More info:
		// - https://www.baeldung.com/java-9-stream-api
	}
}
