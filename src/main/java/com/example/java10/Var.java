package com.example.java10;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Var {

	private String name = "Iñaki";

	public static void main(String[] args) {

		// type inference
		List<Integer> myList = List.of(1, 2, 3);
		log.info("My list: {}", myList);


		// var only works with local variables


		// cannot infer type when null
//		var name = null;


		// choosing a good variable name is more important than ever
		var bandMembers = List.of("John", "Paul", "George", "Ringo");
		log.info("Members: {}", bandMembers);


		// beware of the diamond operator + var
		List<String> list = new ArrayList<>();
		List<String> copyList = list;


		// beware of generic methods with type inference
		List<String> otherList = List.of();
		List<String> copyOtherList = otherList;


		// it is mandatory to initialize the variable so that it knows what type it is
//		var notInitialized;
//		notInitialized = "Hello!";


		// the variable has a (inferred) type, it's not like in JavaScript
//		var number = 1;
//		number = "hola mundo";


		// Example in demoReader();


		// Another example in removeMatches();


		// More info:
		// - https://openjdk.org/projects/amber/guides/lvti-style-guide
		// - https://openjdk.org/projects/amber/guides/lvti-faq
	}

	private static String demoReader(final Socket socket) throws IOException {

		try (final InputStream inputStream = socket.getInputStream();
			final InputStreamReader streamReader = new InputStreamReader(inputStream, UTF_8);
			final BufferedReader bufferedReader = new BufferedReader(streamReader)) {

			return bufferedReader.readLine();
		}
	}

	private static void removeMatches(final Map<? extends String, ? extends Number> map, int max) {

		for (final Iterator<? extends Map.Entry<? extends String, ? extends Number>> iterator = map.entrySet().iterator(); iterator.hasNext(); ) {

			// IDE: replace explicit type with var
			final Map.Entry<? extends String, ? extends Number> entry = iterator.next();

			if (max > 0 && matches(entry)) {
				iterator.remove();
				max--;
			}
		}
	}

	private static boolean matches(Entry<? extends String, ? extends Number> entry) {

		return entry.getValue().floatValue() > 0.5f;
	}
}
