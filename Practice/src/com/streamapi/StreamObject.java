package com.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class StreamObject {
	public static void main(String[] args) {
		//stream API -collection process
		//collection /group of object
		
		//1-blanck
		Stream<Object> emptyStream = Stream.empty();
		emptyStream.forEach(e -> {
			System.out.println(e);
		});
		
		
		//2-array,object,collection
		
		String names[]= {"Durgesh","Uttam","Ankit","Divya"};
		Stream<String> stream1 = Stream.of(names);
		
		stream1.forEach(e -> {
			System.out.println(e);
		});
		
		
		//3
		Stream<Object> streamBuilder= Stream.builder().build();
		
		
		//4
		IntStream stream = Arrays.stream(new int[] {2,4,65,3,564});
		stream.forEach(e -> {
			System.out.println(e);
		});
		
		
		//5. List,Set
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(8);
		list1.add(45);
		list1.add(21);
		list1.add(54);
		
		Stream<Integer> stream2 = list1.stream();
		stream2.forEach(e ->{
			System.out.println(e);
		});
		
		}
}
