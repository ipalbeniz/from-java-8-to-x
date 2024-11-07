package com.example.java9;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JShell {

	public static void main(String[] args) {

		// execute "jshell" in the console

		var demo = "Hola";
		System.out.println(demo);

		// /vars - to see the defined variables

		// void myMethod() { System.out.println("hello"); }
		// /methods - to see the defined methods

		// / - to see all commands

		// /exit - to exit jshell


		// More info:
		// - https://openjdk.org/jeps/222
		// - https://www.baeldung.com/java-9-repl
	}

}
