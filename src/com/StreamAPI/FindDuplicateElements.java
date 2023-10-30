package com.StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElements {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(10,1,82,1,1,1,18,39,79,39,47,45,45,1);
//		Set<Integer> set =  asList.stream().
//					filter(e->Collections.frequency(asList, e)>1).collect(Collectors.toSet());
//	    System.out.println(set);
		
		Set<Integer> set = new HashSet<Integer>();
		
		Set<Integer> collect = asList.stream().filter(s->!set.add(s)).collect(Collectors.toSet());
		
		System.out.println(collect);
		
		// to find duplicate names in list
			
		List<String> name = Arrays.asList("Aniket","Aniket","Sahil","Rakesh","Rakesh");
		
		Set<String> set1 = new HashSet<String>();
		
		List<String> collect2 = name.stream().filter(n->!set1.add(n)).collect(Collectors.toList());
		
		System.out.println(collect2);
			
	}

}
