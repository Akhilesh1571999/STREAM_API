package com.StreamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ContainsDuplicate {
	 
//	public static boolean duplicate() {
//		List<Integer> list = Arrays.asList(1,2,2,3,4,8,9,6);
//		
//		Set<Integer>set = new HashSet<Integer>(list);
//		
//		if (set.size()==list.size()) {
//			return true;
//		}else {
//			return false;
//		}
//	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,2,3,4,8,9,6);
		
		List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
		
		if(list.size()==collect.size()) {
			System.out.println("Duplicate is not present");
		}else {
			System.out.println("Duplicate is present");
		}
		
		
//		System.out.println(duplicate());
	}

}
