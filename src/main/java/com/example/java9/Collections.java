package com.example.java9;

import static java.util.Map.entry;

import java.util.List;
import java.util.Map;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Collections {

	public static void main(String[] args) {

		// new methods to create immutable collections
		List<Integer> myList = List.of(1, 2, 3);
		log.info("My list: {}", myList);

		Set<Integer> mySet = Set.of(1, 2, 3);
		log.info("My set: {}", mySet);


		// it does not allow null elements, throwing a runtime exception
//		mySet = Set.of(1, 2, null);


		// it does not allow duplicates, throwing a runtime exception
//		mySet = Set.of(1, 2, 2, 2, 3);


		Map<String, Integer> myMap = Map.of("key1", 1,
											"key2", 2);
		log.info("My map: {}", myMap);


		// it does not allow duplicate keys, throwing a runtime exception
//		myMap = Map.of("key1", 1,
//					   "key1", 2);


		// it does not allow nulls in the key or value
//		myMap = Map.of("key1", null,
//					   "key2", 2);


		// limited to 10 elements
		myMap = Map.of("key1", 1,
					   "key2", 2,
					   "key3", 3,
					   "key4", 4,
					   "key5", 5,
					   "key6", 6,
					   "key7", 7,
					   "key8", 8,
					   "key9", 9,
					   "key10", 10);
		log.info("My map: {}", myMap);


		// For more than 10 elements, use Map.ofEntries
		myMap = Map.ofEntries(entry("key1", 1),
							  entry("key2", 2),
							  entry("key3", 3),
							  entry("key4", 4),
							  entry("key5", 5),
							  entry("key6", 6),
							  entry("key7", 7),
							  entry("key8", 8),
							  entry("key9", 9),
							  entry("key10", 10),
							  entry("key11", 11),
							  entry("key12", 12));
		log.info("My map: {}", myMap);


		// More info:
		// - https://www.baeldung.com/java-9-collections-factory-methods
	}
}
