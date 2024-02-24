package com.distinguish;

import java.util.*;
import java.util.stream.Collectors;

public class Trial {
	
	public static void main(String[] args) {
	
	ArrayList<Integer> arrayList= new ArrayList<>();
		
	System.out.print("Write the numbers you want to add : ");
	
	Scanner scan = new Scanner(System.in);
	
	int input = scan.nextInt();
	int in;
	
	for(int i=1;i<=input;i++) {
		
		System.out.println("Please write the " +i +"th number :" );
		
		in=scan.nextInt();
		
		arrayList.add(in);
		
	}
	
	System.out.println("The arrayList you enter is : " +arrayList);
	
	List<Integer> negativeNumber = arrayList.stream().filter((i)->i<0).
			collect(Collectors.toList());
	
		long negativeCount = negativeNumber.stream().count();
	
	List<Integer> positiveNumber = arrayList.stream().filter(i->i>0).
								collect(Collectors.toList());
	
	long positiveCount = positiveNumber.stream().count();
	
	List<Integer> zeroNumber = arrayList.stream().filter(i->i==0).
							collect(Collectors.toList());
	
	long zeroCount = zeroNumber.stream().count();
	
	System.out.println("Positive Number : " +positiveNumber);
	System.out.println("The count is : " +positiveCount);
	
	System.out.println("Negative Number : " +negativeNumber);
	System.out.println("The count is : " +negativeCount);
	
	System.out.println("Zero Number : "+zeroNumber);
	System.out.println("Zero Number : "+zeroCount);
	
	Collections.reverse(arrayList);
	
	System.out.println("The reversed arrayList is : \n" +arrayList);
	}
}
