package com.example.java14;

import java.time.DayOfWeek;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SwitchExpressions {

	public static void main(String[] args) {

		final DayOfWeek day = DayOfWeek.WEDNESDAY;

		// old way
		switch (day) {
			case MONDAY:
			case FRIDAY:
			case SUNDAY:
				log.info("6 letters");
				break;
			case TUESDAY:
				log.info("7 letters");
				break;
			case THURSDAY:
			case SATURDAY:
				log.info("8 letters");
				break;
			case WEDNESDAY:
				log.info("9 letters");
				break;
		}

		int letters = 0;
		switch (day) {
			case MONDAY:
			case FRIDAY:
			case SUNDAY:
				letters = 6;
				break;
			case TUESDAY:
				letters = 7;
				break;
			case THURSDAY:
			case SATURDAY:
				letters = 8;
				break;
			case WEDNESDAY:
				letters = 9;
				break;
		}

		log.info("Letters old way: {}", letters);


		// new way
		switch (day) {
			case MONDAY, FRIDAY, SUNDAY -> log.info("6 letters");
			case TUESDAY -> log.info("7 letters");
			case THURSDAY, SATURDAY -> log.info("8 letters");
			case WEDNESDAY -> log.info("9 letters");
		}


		letters = switch (day) {
			case MONDAY, FRIDAY, SUNDAY -> 6;
			case TUESDAY -> 7;
			case THURSDAY, SATURDAY -> 8;
			case WEDNESDAY -> {
				log.info("Calculating days for Wednesday");
				yield 9;
			}
		};

		log.info("Letters new way: {}", letters);


		// More info:
		// - https://openjdk.org/jeps/361
		// - https://www.baeldung.com/java-switch#switch-expressions
	}
}
