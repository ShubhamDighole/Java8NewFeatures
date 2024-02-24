package com.streamreduce;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamReduce {

	// sum of 10 numbers

	public static void main(String[] args) {

		OptionalInt opt = IntStream.rangeClosed(1, 10).reduce((a, b) -> a + b);

		System.out.println(opt.getAsInt());

		int asInt = IntStream.rangeClosed(1, 10).distinct().reduce((a, b) -> a + b).getAsInt();

		System.out.println(asInt);
	}

}
