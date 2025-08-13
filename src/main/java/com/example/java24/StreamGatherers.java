package com.example.java24;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.stream.Gatherers;
import java.util.stream.Stream;

@Slf4j
public class StreamGatherers {

	public static void main(final String[] args) {

		List<Integer> foldedNumbers = Stream.of(1, 2, 3, 4, 5)
				// fold: many-to-one gatherer
				.gather(Gatherers.fold(() -> 0, Integer::sum))
				.toList();

		log.info("Folded numbers: {}", foldedNumbers);


		List<Integer> scannedNumbers = Stream.of(1, 2, 3, 4, 5)
				// scan: one-to-one gatherer
				.gather(Gatherers.scan(() -> 0, Integer::sum))
				.toList();

		log.info("Scanned numbers: {}", scannedNumbers);


		List<List<Integer>> windowSlidingNumbers = Stream.of(1, 2, 3, 4, 5)
				// windowSliding: many-to-many gatherer
				.gather(Gatherers.windowSliding(3))
				.toList();

		log.info("Window sliding numbers: {}", windowSlidingNumbers);


		List<List<Integer>> windowFixedNumbers = Stream.of(1, 2, 3, 4, 5)
				// windowFixed: many-to-many gatherer
				.gather(Gatherers.windowFixed(3))
				.toList();

		log.info("Window fixed numbers: {}", windowFixedNumbers);


		// More info:
		// - https://openjdk.org/jeps/485
		// - https://www.baeldung.com/java-stream-gatherers
	}

}