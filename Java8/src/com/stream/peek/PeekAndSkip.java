package com.stream.peek;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class PeekAndSkip {

	public static void main(String[] args) {

		List<String> flats = Arrays.asList("B01", "B08", "B03", "B04", "T01", "B02");

		List<String> collect = flats.stream().filter(flat -> flat.startsWith("B")).sorted((a, b) -> b.compareTo(a))
				.collect(Collectors.toList());
//		System.out.println(collect);

		// now i want to skip B03
		List<String> collect1 = flats.stream().filter(flat -> flat.startsWith("B")).sorted().skip(2)
				.collect(Collectors.toList());

//		System.out.println(collect1);

		List<String> collect3 = flats.stream().sorted().skip(3).collect(Collectors.toList());

		// peek
		List<String> collect2 = flats.stream().filter(flat -> flat.startsWith("B")).peek(System.out::print)
				.collect(Collectors.toList());

		// peek is used when debugg..we can check what is the array provided at that
		// particular time we can use stream

//insterad of stream we can also use parallel streams.. 

//this streams works more faster as they do operation in parallel

		System.out.println(collect3);

		Random random = new Random();
		random.ints(10, 50).limit(5).sorted().distinct().forEach(System.out::println);

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println("Last");
		System.out.println(list.stream().collect(Collectors.summingInt((a) -> a)));

	}

}
