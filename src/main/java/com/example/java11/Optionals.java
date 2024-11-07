package com.example.java11;

import java.util.Optional;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Optionals {

	public static void main(String[] args) {

		log.info("Is empty 1: {}", Optional.of("Iñaki").isEmpty());
		log.info("Is empty 2: {}", Optional.empty().isEmpty());
	}
}
