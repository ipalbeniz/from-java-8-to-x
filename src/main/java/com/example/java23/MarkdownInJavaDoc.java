package com.example.java23;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MarkdownInJavaDoc {

	public static void main(final String[] args) {

		log.info(executePrivateMethodWithJavaDoc());

		// More info:
		// - https://openjdk.org/jeps/456
		// - https://www.baeldung.com/java-unnamed-patterns-variables
	}

	/// # Intro
	/// > "The force is strong with `executePrivateMethodWithJavaDoc()`."
	/// > &mdash; _Master Yoda_
	///
	/// Let's write some Markdown lists:
	/// - one
	/// - **two**
	/// - three
	///
	/// # Usage
	/// ```java
	/// MarkdownInJavaDoc.executePrivateMethodWithJavaDoc()
	/// ```
	public static String executePrivateMethodWithJavaDoc() {

		return "private method with JavaDoc";
	}

}