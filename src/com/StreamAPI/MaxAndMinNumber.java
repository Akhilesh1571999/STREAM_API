package com.StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MaxAndMinNumber {

	public static void main(String[] args) {

		 List<Integer> list = Arrays.asList(0,12,23,78,96,96,96,32,42,65,101,-190);
		 
		 Integer integer = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		 Integer integer2 = list.stream().min(Integer::compare).get();
		 
		 System.out.println("Max number ::"+integer);
		 
		 System.out.println("Min number ::"+integer2);

	}

}