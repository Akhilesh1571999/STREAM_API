package com.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,1,2,3,44,56,444,66,55,55,43);
		
		List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
		
		System.out.println(collect);
	}

}
