package com.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Sets {

	public static void main(String[] args) {

		Set<Integer> setInteger = new TreeSet<>();

//creating a set

		setInteger.add(1);
		setInteger.add(11);
		setInteger.add(112);
		setInteger.add(1123);
		setInteger.add(11234);
		setInteger.add(112345);
		setInteger.add(1100);

		Set<Integer> collect = setInteger.stream().filter((a) -> a > 1000).collect
				(Collectors.toSet());

		Set<Integer> collection = new TreeSet<>();

		collection.addAll(collect);

		System.out.println(collection);

//creating a map

		Map setMap = new TreeMap<>();

		Map<Integer, Integer> collect2 = setInteger.stream().
				collect(Collectors.toMap(a -> a, b -> b * 100));

		System.out.println(collect2);
	}
}
