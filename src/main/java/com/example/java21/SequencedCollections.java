package com.example.java21;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SequencedCollections {

	public static void main(final String[] args) {

		// interface SequencedCollection

		var myList = List.of(1, 2, 3);

		log.info("First: {}", myList.getFirst());
		log.info("Last: {}", myList.getLast());
		log.info("Reversed: {}", myList.reversed());

		// what will happen?
//		myList.addFirst(0);


		// mutable list
		var myMutableList = new ArrayList<>(myList);

		myMutableList.addFirst(0);
		myMutableList.addLast(4);
		myMutableList.addLast(5);
		myMutableList.removeLast();
		log.info("Mutable list: {}", myMutableList);


		// More info:
		// - https://openjdk.org/jeps/431
		// - https://www.baeldung.com/java-21-sequenced-collections
	}
}