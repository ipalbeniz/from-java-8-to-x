package com.example.java9;

import java.util.Optional;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Optionals {

	public static void main(String[] args) {

		// new method: ifPresentOrElse
		Optional.of("Iñaki")
			.ifPresentOrElse(name -> log.info("Present: {}", name),
							 () -> log.error("No name"));

		Optional.empty()
			.ifPresentOrElse(name -> log.info("Present: {}", name),
							 () -> log.error("No name"));


		// new method: or with Supplier
		Optional.ofNullable(1)
			.or(() -> Optional.of(2))
			.ifPresent(num -> log.info("Number: {}", num));


		// new method: stream
		Optional.of("Iñaki")
//		Optional.<String>empty()
			.stream()
			.map(String::toUpperCase)
			.forEach(name -> log.info("Name: {}", name));


		// More info:
		// - https://www.baeldung.com/java-optional#java-9
	}
}
