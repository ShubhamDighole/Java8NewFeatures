package flatmaps;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMaps {
	
	public static void main(String[] args) {
	
	List<Integer> arrayList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);		
	
	System.out.println("arrayList : " +arrayList);
	
// multiplying each element by 3 without old elements
	List<Integer> collect = arrayList.stream().map(a->3*a).collect(Collectors.toList());
		
	System.out.println("Collect : "+collect);
	
// multiplying each element by 3 with old elements	
	List collect2 = arrayList.stream().map(a->Arrays.asList(a,a*3)).collect(Collectors.toList());
	System.out.println(collect2);
	
//with the help of flatMap
	List<Integer> collect3 = arrayList.stream().flatMap(x->Stream.of(x,x*3)).collect(Collectors.toList());
	System.out.println(collect3);
	

	
	List<Integer> list=arrayList.stream().flatMap(a-> {
		if(a%2!=0) {
			return Stream.of(a*2)
			;
			}else {
				return Stream.of(a*1);
				}
	}).collect(Collectors.toList());
	
	System.out.println(list);
	
//if we want to do opearation and get the result in only one list we can use flat maps..
	
	}
}
