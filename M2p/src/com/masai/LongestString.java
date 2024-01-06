
package com.masai;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LongestString {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("delih","gurugram","noida","chennaii");
		
	
		int max=list.stream().mapToInt(String::length).max().orElse(0);
		
		List<String> length=list.stream().filter(s-> s.length()==max).collect(Collectors.toList());
		System.out.println(length);
		
	}
}
