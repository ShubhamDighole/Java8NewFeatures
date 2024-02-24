package com.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClassForBatsman {
	
	public static void main(String[] args) {
	
		List list= Arrays.asList(new Batsman(1,"Rohit",3,5.5f),
								 new Batsman(2,"Virat",1,7.2f),
								 new Batsman(3,"Surya",2,6f)
				);
		List<Batsman> batsman=new ArrayList<>(list);
		int i=1;
		for(Batsman b: batsman) {
			
			System.out.println("Future of India : " +i);
			System.err.println(b);
			System.out.println();
			i++;
		}
		System.out.println(batsman);
	}
}
