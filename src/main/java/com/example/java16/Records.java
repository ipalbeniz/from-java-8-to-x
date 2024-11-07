package com.example.java16;

import java.util.Objects;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Records {

	public static void main(String[] args) {

		// Records: immutable DTOs

		Person person = new Person("Palpatine", "Emperor", "@DarthSidious");

		// accessors
		log.info("Person name: {}", person.fullname());
		log.info("Person twitter: {}", person.twitterHandle());

		// toString
		log.info("Person: {}", person);

		// hashCode
		log.info("Person hashCode: {}", person.hashCode());

		// equals
		Person person2 = new Person("Palpatine", "Emperor", "@DarthSidious");
		log.info("Person equals: {}", person.equals(person2));

		// custom constructor with one parameter
		person = new Person("Palpatine");
		log.info("Person: {}", person);

		// custom constructor implementation
		person = new Person("Palpatine", null, null);
		log.info("Person: {}", person);


		// More info:
		// - https://openjdk.org/jeps/409
		// - https://www.baeldung.com/java-record-keyword
	}

	record Person(String fullname, String jobTitle, String twitterHandle) {

		public Person {
			Objects.requireNonNull(fullname, "fullname cannot be null");
			Objects.requireNonNull(jobTitle, "jobTitle cannot be null");
			Objects.requireNonNull(twitterHandle, "twitterHandle cannot be null");
		}

		public Person(String fullname) {
			this(fullname, "Unknown", "@Unknown");
		}
	}

	class PersonClass {

		private final String fullname;
		private final String jobTitle;
		private final String twitterHandle;

		public PersonClass(String fullname, String jobTitle, String twitterHandle) {

			this.fullname = fullname;
			this.jobTitle = jobTitle;
			this.twitterHandle = twitterHandle;
		}

		@Override
		public int hashCode() {

			return Objects.hash(fullname, jobTitle, twitterHandle);
		}

		@Override
		public boolean equals(Object obj) {

			if (this == obj) {
				return true;
			} else if (!(obj instanceof Person)) {
				return false;
			} else {
				Person other = (Person) obj;
				return Objects.equals(fullname, other.fullname)
					   && Objects.equals(jobTitle, other.jobTitle)
					   && Objects.equals(twitterHandle, other.twitterHandle);
			}
		}

		@Override
		public String toString() {

			return "Person [fullname=" + fullname + ", jobTitle=" + jobTitle + ", twitterHandle=" + twitterHandle + "]";
		}

		public String fullname() {

			return fullname;
		}

		public String jobTitle() {

			return jobTitle;
		}

		public String twitterHandle() {

			return twitterHandle;
		}
	}

}
