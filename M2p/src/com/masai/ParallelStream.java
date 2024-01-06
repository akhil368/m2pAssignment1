package com.masai;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<1000000;i++)
		{
			list.add(i);
		}
		
		long start=System.currentTimeMillis();
		long stream=list.stream().reduce(0, Integer::sum);
		long end=System.currentTimeMillis();
		System.out.println("Sum is : "+stream);
		System.out.println("Stream Time "+(end-start) );
		
		long parallelStart =System.currentTimeMillis();
		long parallelStream=list.parallelStream().reduce(0, Integer::sum);
		 long prallelEnd=System.currentTimeMillis();
		 System.out.println("Sum Using parallel Stream  :"+parallelStream);
		 
		 System.out.println("Parallel  Stream :"+(prallelEnd-parallelStart));
		
	}
}
