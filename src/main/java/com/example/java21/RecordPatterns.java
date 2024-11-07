package com.example.java21;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RecordPatterns {

	public static void main(final String[] args) {

		Object object = new Person("Kelsier", 38);

		if (object instanceof Person person) {
			String fullname = person.fullname();
			int age = person.age();
			log.info("{} is {} years old", fullname, age);
		}

		// with record patterns
		if (object instanceof Person(String fullname, int age)) {
			log.info("{} is {} years old", fullname, age);
		}


		// More info:
		// - https://openjdk.org/jeps/440
		// - https://www.baeldung.com/java-19-record-patterns
	}

	record Person(String fullname, int age) {}
}