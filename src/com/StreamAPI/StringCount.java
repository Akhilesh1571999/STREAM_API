package com.StreamAPI;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StringCount {

	public static void main(String[] args) {
		String s = "string data to count each character";
		
		Map<String, Long>map = Arrays.stream(s.split("")).map(String::toUpperCase)
				.collect(Collectors.groupingBy(str->str ,Collectors.counting()));
		
		System.out.println(map);
	}

}
