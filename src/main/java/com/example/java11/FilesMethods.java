package com.example.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FilesMethods {

	public static void main(String[] args) throws IOException {

		// read file content
		String content = Files.readString(Paths.get("src/main/resources/file.txt"));
		log.info("File content: {}", content);


		// write file content
		Files.writeString(Paths.get("src/main/resources/file-write.txt"), "Hello world!");
	}
}
