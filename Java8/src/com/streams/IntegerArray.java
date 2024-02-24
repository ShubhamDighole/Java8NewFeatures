package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerArray {
	
	public static void main(String[] args) {
		
		String[] s= {null};
		
	
	ArrayList<Integer> array= new ArrayList<>();
	
	array.add(0);
	array.add(1);
	array.add(2);
	array.add(3);
	array.add(4);
	array.add(5);
	
	
	List<Integer> collect = array.stream().map(a->a*3).collect(Collectors.toList());
			
	
	System.out.println(collect);
	System.out.println(s[1]);
	}
}
