package com.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LimitNumbers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,5,6,7,3,8,9,3,2,34,22,12);
		//limit
		List<Integer> sorted = list.stream().limit(5).collect(Collectors.toList());
	
		System.out.println("Limit 5 >>"+sorted);
	
		//sum of limit
		Optional<Integer> reduce = list.stream().limit(5).reduce((a,b)->a+b);
		
		System.out.println("sum of limit>>"+reduce.get());
		
		//skip
		List<Integer> skip = list.stream().skip(5).collect(Collectors.toList());
		
		System.out.println("skip " +skip);
	}

}
