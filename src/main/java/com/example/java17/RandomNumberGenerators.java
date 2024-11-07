package com.example.java17;

import java.util.Random;
import java.util.random.RandomGenerator;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RandomNumberGenerators {

	public static void main(String[] args) {

		// old way: Random, ThreadLocalRandom and SecureRandom
		Random random = new Random();
//		Random random = ThreadLocalRandom.current();
//		Random random = new SecureRandom();
		int number = random.nextInt(100);
		log.info("Random number old way {}", number);


		// new way: RandomGenerator interface and algorythm name: Random, SecureRandom, L32X64MixRandom (default), Xoroshiro128PlusPlus ...
		RandomGenerator randomGenerator = RandomGenerator.getDefault();
//		RandomGenerator randomGenerator = RandomGenerator.of("Random");
//		RandomGenerator randomGenerator = RandomGenerator.of("SecureRandom");
		number = randomGenerator.nextInt(100);
		log.info("Random number new way {}", number);


		// More info:
		// - https://openjdk.org/jeps/356
		// - https://www.baeldung.com/java-17-random-number-generators
	}

}
