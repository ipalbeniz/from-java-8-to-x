package com.example.java15;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TextBlocks {

	public static void main(String[] args) {

		// old way
		String message = "{\n"
						 + "    \"fullName\": \"Palpatine\",\n"
						 + "    \"jobTitle\": \"Emperor\",\n"
						 + "    \"twitterHandle\": \"@DarthSidious\"\n"
						 + "}\n";

		log.info("{}", message);


		// new way
		String messageBlock = """
			{
			    "fullName": "Palpatine",
			    "jobTitle": "Emperor",
			    "twitterHandle": "@DarthSidious"
			}
			""";

		log.info("{}", messageBlock);


		// More info:
		// - https://openjdk.org/jeps/378
		// - https://www.baeldung.com/java-text-blocks
	}
}
