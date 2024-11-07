package com.example.java21;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class VirtualThreads {

	public static void main(final String[] args) throws InterruptedException, ExecutionException {

		// Java virtual threads offer a lightweight alternative to OS threads, enhancing concurrency in I/O-bound tasks
		// by reducing blocking and optimizing resource usage.
		Thread myVirtualThread = Thread.ofVirtual()
			.name("my-prefix-", 0)
			.start(() -> log.info("virtual thread started! {}", Thread.currentThread()));

		myVirtualThread.join();


		// Virtual threads do not need to be pooled.
		// A pool is used to share expensive resources.
		// Virtual threads, on the other hand, are so cheap that it is better to create one when you need it
		// and let it terminate when you no longer need it.
		try (var myExecutor = Executors.newVirtualThreadPerTaskExecutor()) {
			Future<?> future = myExecutor.submit(() -> log.info("virtual thread from executor! {}", Thread.currentThread()));
			future.get();
		}


		// how many platform threads can be created?
		// - on a 64 GB machine: 80K - 90k

		// how many virtual threads can be created?
		// - on a 64 GB machine: 20M - 30M


		// how long does it take to create a platform thread?
		// - 1 ms

		// how long does it take to create a virtual thread?
		// - 1 µs


		// how much memory is reserved for the stack in a platform thread?
		// - 1 MB

		// how much memory is reserved for the stack in a virtual thread?
		// - 1 KB (dynamic)


		// context switch is faster in virtual threads (user space vs kernel space)


		// Pinning: a blocking operation that would normally unmount a virtual thread from its carrier thread does not do so
		// because the virtual thread has been “pinned” to its carrier thread – meaning that it is not allowed to change the
		// carrier thread. This happens in two cases:
		// - inside a synchronized block
		// - if the call stack contains calls to native code
		//
		// solution: replace synchronized blocks with a ReentrantLock


		// More info:
		// - https://openjdk.org/jeps/444
		// - https://docs.oracle.com/en/java/javase/21/core/virtual-threads.html
		// - https://www.happycoders.eu/java/virtual-threads/
		// - https://rockthejvm.com/articles/the-ultimate-guide-to-java-virtual-threads/
	}
}