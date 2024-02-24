package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
	
	public static void main(String[] args) {
	
// collect elemnts starting with alphabate B
		
		List<String> ar= Arrays.asList("Apple","Bat","Ball","Car"
				+ "Zebra","Telephone","add","advise");
		
		System.out.println("+-+-+-+-+-+-+-++-+-+-+-++-+-+-+-+-+-+-++-+-+-+-++-+-+-+-+-+-+-++-+-+-+-+");
		
		List<String> collect2 = ar.stream().filter((a)->(a.startsWith("B") || a.startsWith("b") )).collect(Collectors.toList());
	
		System.out.println(collect2);
		
		System.out.println("+-+-+-+-+-+-+-++-+-+-+-++-+-+-+-+-+-+-++-+-+-+-++-+-+-+-+-+-+-++-+-+-+-+");
		
		List<String> collect = ar.stream().map(String::toUpperCase).filter(i->i.startsWith("A")).collect(Collectors.toList());
	
//		System.out.println(collect);
		
//with help of forEach loop
		
		ar.stream().map(a->a.toUpperCase()).filter(i->i.startsWith("A")).forEach(b->{System.out.print(b);System.out.println();});

//more optimise code
		ar.stream().map(a->a.toUpperCase()).filter(i->i.startsWith("A")).forEach(System.out::println);
	}
}
