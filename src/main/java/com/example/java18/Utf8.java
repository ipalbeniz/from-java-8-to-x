package com.example.java18;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;

@Slf4j
public class Utf8 {

	public static void main(final String[] args) throws IOException {

		Charset charset = Charset.defaultCharset();
		log.info("Default charset: {}", charset);


		InputStream fileStream = Utf8.class.getClassLoader().getResourceAsStream("utf-8.txt");
		String fileContents = IOUtils.toString(fileStream);
		log.info("File contents: {}", fileContents);


		// More info:
		// - https://openjdk.org/jeps/400
		// - https://www.agileconnection.com/article/new-java-18-feature-default-charset-utf-8
	}
}
