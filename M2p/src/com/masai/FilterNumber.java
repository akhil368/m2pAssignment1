package com.masai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNumber {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,2,3,4,5);
		
		List<Integer> even= list.stream().filter(i-> i%2==0).collect(Collectors.toList());
		System.out.println(even);
		
		int sum=even.stream().mapToInt(i-> i*i).sum();
		System.out.println(sum);
				
	}
}
