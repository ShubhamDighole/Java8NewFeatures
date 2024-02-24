package com.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateClass {

	public static void main(String[] args) {

		Integer[] list = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		Predicate<Integer> evenNumber = (i) -> (i % 2) == 0;

		Predicate<Integer> gt10Number = (i) -> (i > 6);

		ArrayList<Integer> evenNumberList = new ArrayList<Integer>();

		ArrayList<Integer> oddNumberList = new ArrayList<Integer>();

		List<Integer> asList = Arrays.asList(list);

		asList.stream().filter(gt10Number.and(evenNumber)).forEach(a -> evenNumberList.add(a));

		System.out.println("List after applying filter and adding the numbers : " + evenNumberList);

		for (Integer number : list) {

			if (gt10Number.and(evenNumber).test(number)) {

				evenNumberList.add(number);
			}

		}
		System.out.println("The given List of array is : " + "\n" + list.toString());
		System.out.println("List of Even numbers present inside the list" + "\n" + evenNumberList);
		System.out.println("List of Odd numbers present inside the list" + "\n" + oddNumberList);
	}
}
