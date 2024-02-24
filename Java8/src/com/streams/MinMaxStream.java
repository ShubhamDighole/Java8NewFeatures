package com.streams;

import java.util.ArrayList;

public class MinMaxStream {
	
	public static void main(String[] args) {
	
	ArrayList<String> arrayList=new ArrayList<>();
		
	arrayList.add("aniket");
	arrayList.add("shubham");
	arrayList.add("Chiraag");
	arrayList.add("chiraag");
	
	String integer = arrayList.stream().min((a,b)->(a.compareTo(b))).get();
	System.out.println(integer);
	}
}
 