package com.example.java9;

import com.example.java9.aux.Interface;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Interfaces {

	public static void main(final String[] args) {

		final Interface demo = new Demo();

		demo.defaultMethod();
		Interface.defaultMethodStatic();

		// More info:
		// - https://www.baeldung.com/java-interface-private-methods
	}

	private static class Demo implements Interface {

	}
}
