package com.masai;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class FilterEmployee {

	public static void main(String[] args) {
		
		List<Employee> list=new ArrayList<>();
		
		list.add(new Employee("Akhil",1,22));
		
		list.add(new Employee("Anand",2,23));
		
		list.add(new Employee("Prem",3,21));
		
		list.add(new Employee("Piyush",4,19));
		
		List<Employee> filteredList  =list.stream().filter(e-> e.getName().startsWith("A") && e.getId()%2 !=0 && e.getAge()%2==0)
			.collect(Collectors.toList());
		
		System.out.println(filteredList);
			
	}
	
}
