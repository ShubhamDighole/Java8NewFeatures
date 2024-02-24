package com.comparator;

import java.util.*;
import java.util.stream.Collectors;

public class MainTest {
	
	public static void main(String[] args) {
	
	//Employee emp1 = new Employee(1, "John", 1000);
	//Employee emp2 = new Employee(2, "Josh", 1500);

	
	List<Employee> employeeList= Arrays.asList(new Employee(1, "John", 1000),
												new Employee(2, "Josh", 1500));
	
	Optional<Employee> desiredOutput = employeeList.stream().sorted
			(Comparator.comparingInt(Employee::getSallary)).findFirst();
	
	//stream().sorted(Comparator.comparingInt(Employee::getId).reversed()).findFirst();
	
	desiredOutput.ifPresent(System.out::print);
	System.out.println();
	
	Optional<Employee> findSecond = employeeList.stream().
									sorted(Comparator.comparingInt(Employee::getSallary)).
									skip(1).findFirst();
	
	findSecond.ifPresent(System.out::println);
	
	IntSummaryStatistics collect = employeeList.stream().collect
								(Collectors.summarizingInt(a->a.getSallary()));
	
	System.out.println(collect);
	}
}
