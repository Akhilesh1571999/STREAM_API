package com.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class AverageOfAllNumbers {

	public static void main(String[] args) {

		 List<Integer> asList = Arrays.asList(12,23,78,96,32,42,65);
		 
		 double asDouble = asList.stream().mapToInt(a->a).average().getAsDouble();
		 
		 System.out.println(asDouble);
		 
	}

}
