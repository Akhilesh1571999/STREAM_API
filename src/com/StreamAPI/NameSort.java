package com.StreamAPI;

import java.security.PermissionCollection;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class NameSort {

	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Akhilesh","Aniket","Sahil","Rahul","Kartik","Bhushan","Sanket");
		
	
//		Map<String, String> collect = nameList.stream().filter(name->!name.isEmpty())
//		               .collect(Collectors.toMap(name->String.valueOf(name.charAt(0)),name-> name));
		
		
		Map<String, String> collect = nameList.stream().filter(n->!n.isEmpty())
					.collect(Collectors.toMap(n->String.valueOf(n.charAt(0)),n->n,(existing, replacement) -> existing + "," + replacement));
		
//		
//		Map<String, List<String>> collect1 = nameList.stream().filter(name->!name.isEmpty())
//		.collect(Collectors.groupingBy(name->String.valueOf(name.charAt(0)),Collectors.mapping(name->name,Collectors.toList())));

		
		Map<String, List<String>> collect1 = nameList.stream().filter(n->!n.isEmpty())
				.collect(Collectors.groupingBy(n->String.valueOf(n.charAt(0)),Collectors.toList()));
		
		System.out.println(collect);
		System.out.println(collect1);
		
		for(String key:collect1.keySet()) {
			List<String> values = collect1.get(key);
			
			for(String value:values) {
				System.out.println(key+"--"+value);
			}
		}		

		}
		
		
}


