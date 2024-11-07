package com.example.java17;

public class SealedClasses {

	public static void main(String[] args) {

		// A class or an interface can now define which classes can implement or extend it


		// More info:
		// - https://openjdk.org/jeps/409
		// - https://www.baeldung.com/java-sealed-classes-interfaces
	}

	public abstract sealed class User permits Pedro, Laura {
		public abstract String getName();
	}

	public non-sealed class Pedro extends User {

		@Override
		public String getName() {
			return "Pedro";
		}
	}

	public final class Laura extends User {

		@Override
		public String getName() {
			return "Laura";
		}
	}

//	public final class Juan extends User {
//
//		@Override
//		public String getName() {
//			return "Juan";
//		}
//	}

}
