package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedList {
	
	public static void main(String[] args) {
	
		ArrayList<String> arrayList=new ArrayList<>();
		
		arrayList.add("Shubham1");
		arrayList.add("Shubham2");
		arrayList.add("Shubham4");
		arrayList.add("Shubham3");
		arrayList.add("Shubham5");
	
		System.out.println(arrayList);

//ascending order sorting
		List<String> collect = arrayList.stream().sorted().collect(Collectors.toList());
		
		System.out.println("List after sorting is :\n" +collect);
		
//custom sorting in ascending order
		List<String> collect1=arrayList.stream().sorted((ob1,ob2)->ob1.compareTo(ob2)).collect(Collectors.toList());
		System.out.println(collect1);


//custom sorting in ascending order
		List<String> collect2=arrayList.stream().sorted((ob1,ob2)->ob2.compareTo(ob1)).collect(Collectors.toList());
		System.out.println(collect2);
	}
}
