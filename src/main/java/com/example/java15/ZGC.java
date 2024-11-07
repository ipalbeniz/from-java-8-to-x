package com.example.java15;


public class ZGC {

	public static void main(String[] args) {

		// ZGC is a scalable low-latency garbage collector capable of handling heaps ranging from 8MB to 16TB in size, with sub-millisecond max pause times.
		// command: java -XX:+UseZGC -Xlog:gc ZGC.java

		System.out.println("Hello!");


		// More info:
		// - https://openjdk.org/jeps/377
		// - https://www.baeldung.com/jvm-zgc-garbage-collector
	}
}
