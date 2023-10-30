package com.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfListIntegers {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(28,12,23,21,4,56,77,54,92,17);
		
		Optional<Integer> reduce = asList.stream().reduce((a,b)-> a+b);
		
		System.out.println(reduce.get());
	}

}
