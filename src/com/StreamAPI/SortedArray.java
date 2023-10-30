package com.StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortedArray {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0,5,66,32,2,1,55,4,79,54);
		
		
		List<Integer> assending = list.stream().sorted().collect(Collectors.toList());
		
		System.out.println(assending);
		
		List<Integer> descending = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(descending);
	}

}
