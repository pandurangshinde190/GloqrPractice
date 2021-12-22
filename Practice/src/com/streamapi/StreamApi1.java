package com.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi1 {
	public static void main(String[] args) {
		// Q) create a List and filter all even numbers form list
		//

		List<Integer> list1 = new ArrayList<Integer>();
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

//		System.out.println(list1);

		// Type 3 to declare arraylist(does not change)
		List<Integer> list3 = Arrays.asList(23, 567, 45, 12, 24);
//		System.out.println(list3);

		// List1
		// without stream
		List<Integer> listEven = new ArrayList<Integer>();
		for (Integer i : list1) {
			if (i % 2 == 0) {
				listEven.add(i);
			}
		}
		System.out.println(list1);
		System.out.println(listEven);

		// using stream
		Stream<Integer> stream = list1.stream();
//		List<Integer> newList = stream.filter(i -> i%2==0).collect(Collectors.toList());
//		System.out.println(newList);

		List<Integer> newList = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(newList);

		List<Integer> newList1 = list1.stream().filter(i -> i > 10).collect(Collectors.toList());
		System.out.println(newList1);

	}
}
