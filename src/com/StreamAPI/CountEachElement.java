package com.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachElement {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("AA","BB","DD","CC","DD","AA","AA");
		
		Map<String, Long> collect = list.stream()
				.collect(Collectors.groupingBy(s->s,Collectors.counting()));

		System.out.println(collect);

	}

}
