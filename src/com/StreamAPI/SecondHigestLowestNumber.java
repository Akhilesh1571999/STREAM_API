package com.StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class SecondHigestLowestNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0,8,1,79,79,1,4,56,67,78,78,79,105,123);
		
		
		Integer secondHighest = list.stream().sorted(Collections.reverseOrder()).distinct()
										.limit(2).skip(1).findFirst().get();

		System.out.println("Second highest number >>" +secondHighest);
		
		
		Integer integer = list.stream().sorted().distinct().limit(2).skip(1).findFirst().get();
		
		System.out.println("Second lowest number >>"+ integer);
		

	}

}
