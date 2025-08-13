package com.example.java24;

import lombok.extern.slf4j.Slf4j;

import java.time.Duration;

@Slf4j
public class SynchronizeWithoutPinning {

	private static int count = 0;

	public static void main(final String[] args) throws InterruptedException {

		System.setProperty("jdk.tracePinnedThreads", "full");

		Thread.ofVirtual().start(SynchronizeWithoutPinning::increment).join();

		// More info:
		// - https://openjdk.org/jeps/491
	}

	private static synchronized void increment() {
		count++;
		sleep();
		log.info("Count: {}", count);
	}

	private static void sleep() {
		try {
			Thread.sleep(Duration.ofSeconds(1));
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new RuntimeException(e);
		}
	}

}