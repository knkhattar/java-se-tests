package com.kkcom.javase.newfeatures;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class JourneyOfForLoopInJava {
	public static void main(String args[]) throws IOException {

		// pre JDK 1.5, printing each element of List using for loop

		List<String> countries = Arrays.asList("India", "Australia", "England",
				"South Africa");

		for (int i = 0; i < countries.size(); i++) {
			System.out.println(countries.get(i));
		}

		// In Java 5
		for (String country : countries) {
			System.out.println(country);
		}

		// Java 8
		
		// countries.stream().forEach(str -> System.out.println(str));
		// countries.stream()
		// .filter(country -> country.contains("n"))
		// .forEach(str -> System.out.println(str));

	}
}
