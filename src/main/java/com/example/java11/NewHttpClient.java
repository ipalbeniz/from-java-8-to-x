package com.example.java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NewHttpClient {

	public static void main(String[] args) throws IOException, InterruptedException {

		// replace HttpURLConnection

		try (HttpClient httpClient = HttpClient.newBuilder()
			.connectTimeout(Duration.ofSeconds(2))
			.version(HttpClient.Version.HTTP_2)
			.followRedirects(HttpClient.Redirect.ALWAYS)
			.build()) {

			HttpRequest httpRequest = HttpRequest.newBuilder()
				.uri(URI.create("https://postman-echo.com/post"))
				.timeout(Duration.ofSeconds(5))
				.header("demo-header", "demo-value")
				.POST(HttpRequest.BodyPublishers.ofString("hello world body!"))
				.build();

			HttpResponse<String> response =	httpClient.send(httpRequest, BodyHandlers.ofString());
			// async
//			CompletableFuture<HttpResponse<String>>response = httpClient.sendAsync(httpRequest, BodyHandlers.ofString());

			log.info("Response code: {}, body: {}", response.statusCode(), response.body());


			// More info:
			// - https://openjdk.org/jeps/321
			// - https://www.baeldung.com/java-9-http-client
		}
	}
}
