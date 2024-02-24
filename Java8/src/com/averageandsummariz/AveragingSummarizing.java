package com.averageandsummariz;

import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.Set;
import java.util.stream.Collectors;

public class AveragingSummarizing {
	
	public static void main(String[] args) {
	
	Set<Integer>numSet=new HashSet<>();
	
//average the stream
	numSet.add(11);
	numSet.add(12);
	numSet.add(13);
	numSet.add(14);
	numSet.add(15);
	
	
	
	Integer collect = numSet.stream().collect(Collectors.summingInt((a)->a));
	
	System.out.println(collect);
	
	
//summ	ary function
	IntSummaryStatistics collect2 = numSet.stream().collect(Collectors.summarizingInt((a)->a));
	System.out.println(collect2);
	System.out.println(collect2.getAverage());
	System.out.println(collect2.getMax());
	
	}
}
