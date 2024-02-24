package com.casestudy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CaseStudy {
	
	public static void main(String[] args) throws IOException {
	
		Stream<String> rowData = Files.lines(Paths.get("C://Users//DELL//Desktop/1.txt"));
		
		System.out.println(rowData);
		
//get only those data which has sales information not blank
		
		/*
		 * long count = rowData.map(x->x.split(",")).filter(arr->arr.length>2).count();
		 * 
		 * System.out.println(count);
		 */

//print the name of those records which has some sales information 
		
		List<String[]> collect = rowData.map(x->x.split(",")).filter(arr->arr.length>2).collect(Collectors.toList());
		
		for(String[] str:collect) {
			System.out.println("Pizza name : " +str[0] +" : " +"Sales Data : " +str);
		}
	}
}
