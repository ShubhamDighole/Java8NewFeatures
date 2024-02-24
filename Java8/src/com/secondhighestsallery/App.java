package com.secondhighestsallery;
import java.util.*;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {

		EmployeeEntity emp1 = new EmployeeEntity(1, "Ramesh", 1000);
		EmployeeEntity emp2 = new EmployeeEntity(2, "Rakesh", 2000);
		EmployeeEntity emp3 = new EmployeeEntity(3, "Raj", 1050);
		EmployeeEntity emp4 = new EmployeeEntity(4, "Aniket", 2100);
		
		List<EmployeeEntity> employeeList= Arrays.asList(emp1,emp2,emp3,emp4);
		
		Optional<EmployeeEntity> findFirst = employeeList.stream().
				sorted(Comparator.comparingDouble(EmployeeEntity::getSallary).
						reversed()).skip(1).findFirst();
	
	}
}