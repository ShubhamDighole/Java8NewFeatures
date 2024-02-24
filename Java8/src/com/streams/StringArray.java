package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringArray {
	
	public static void main(String[] args) {
	
		ArrayList<String> guns=new ArrayList<>();
		
		guns.add("Ak-47");
		guns.add("Snipper");
		guns.add("M416");
		guns.add("AWM");
		guns.add("Machine Gun");
		guns.add("Shotgun");
		
	//get list of guns whose length is more than 5
		
		ArrayList<String> ar=(ArrayList<String>)guns.stream().filter(gun->gun.length()>5).collect(Collectors.toList());
		
		System.out.println(ar);
		
	//count the number of guns whose length is more than 5
		
		long collectedList = guns.stream().filter(gun->gun.length()>5).count();
		
		System.out.println(collectedList);
		
	//find the length of each gun whose length is more than 5
		
		List<Integer> collect = guns.stream().filter(gun->gun.length()>5).map(gun->gun.length()).collect(Collectors.toList());
	
		System.out.println(collect);
	}
}
