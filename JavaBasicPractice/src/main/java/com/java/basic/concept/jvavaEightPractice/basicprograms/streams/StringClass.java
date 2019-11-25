package com.java.basic.concept.jvavaEightPractice.basicprograms.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringClass {

	public static void main(String[] args) throws IOException {

		// 1. Stream.of, sorted and findFirst
		Stream.of("Ava", "Aneri", "Alberto").sorted().findFirst().ifPresent(System.out::print);
		System.out.println();
		System.out.println("...........................");

		// 2. Stream from Array, sort, filter and print
		String[] strArray = { "Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah" };
		Arrays.stream(strArray) // same as Stream.of(names)
				.filter(x -> x.startsWith("S")).sorted().forEach(System.out::println);

		System.out.println("...........................");
		// 3. Stream from List, filter and print
		List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah");
		people.stream().map(String::toLowerCase).filter(x -> x.startsWith("a")).forEach(System.out::println);
		System.out.println("...........................");

		// 4. Stream rows from text file, sort, filter, and print
		Stream<String> bands = Files.lines(Paths.get(
				"D:\\workspace\\spring_boot_projects\\SpringBoot\\JavaBasicPractice\\src\\main\\java\\com\\java\\basic\\concept\\jvavaEightPractice\\basicprograms\\streams\bands.txt"));
		bands.sorted().filter(x -> x.length() > 13).forEach(System.out::println);
		bands.close();
		System.out.println("...........................");

		// 9. Stream rows from text file and save to List
		List<String> bands2 = Files.lines(Paths.get("bands.txt")).filter(x -> x.contains("jit"))
				.collect(Collectors.toList());
		bands2.forEach(x -> System.out.println(x));
		System.out.println("...........................");

		// 10. Stream rows from CSV file and count
		Stream<String> rows1 = Files.lines(Paths.get("data.txt"));
		int rowCount = (int) rows1.map(x -> x.split(",")).filter(x -> x.length == 3).count();
		System.out.println(rowCount + " rows.");
		rows1.close();
	}
}
