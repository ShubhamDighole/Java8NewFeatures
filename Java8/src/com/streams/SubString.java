package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SubString {

	public static void main(String[] args) {

		int[] i = { 1, 10, 20, 30, 35, 12, 25 };
					//100+400+900+144
					//1544
		int y = 0;
		for (Integer ab : i) {
			
			if (ab % 2 == 0) {
				y = y + ab * ab;
				System.out.println(ab);
			}		
		}
		
		System.out.println(y);
	}
}

//1-1 2-4 3-9 4-16 5-25 6-36 7-49 8-64 9-81 10-100
