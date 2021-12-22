package com.constructorreference;

import java.util.Arrays;
import java.util.List;

public class StreamMain {
public static void main(String[] args) {
	List<Integer> integer = Arrays.asList(14,1235,3658,42,347,58);
	
	System.out.println(integer);
	integer.stream().forEach(System.out::println);
	
}
}
