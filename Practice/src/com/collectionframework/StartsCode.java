package com.collectionframework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;
import java.util.stream.Collectors;

public class StartsCode {
	public static <E> void main(String[] args) {
		System.out.println("Welcome to code java collection framework");
		
		/*
		 creating collection
		 
		 1)Type Safe :- same type of elements(objects) are added to collection
		 
		 2)Un Type safe :-different type of elements can be added to collection
		 
		 */
		
		//Type safe collection
		ArrayList<String> names=new ArrayList<String>();
		names.add("pandurang");
		names.add("Salim");
		names.add("Rohan");
		names.add("Rohan");
		List<String> collectNames = names.stream().collect(Collectors.toList());
		System.out.println(collectNames);
		
		
		//un Type safe
//		LinkedList list=new LinkedList();
//		list.add("pandurang");
//		list.add(101);
//		list.add(500.00);
//		list.add(true);
//		System.out.println(list);
		
//		List<Comparable> list2 = (List<Comparable>) list.stream().collect(Collectors.toList());
//		System.out.println(list2);
		
		
		//remove
//		names.remove(0);
//		System.out.println(names);
		
		//size
		System.out.println("SIZE = "+names.size());
		
		//check item is there or not
		//Type ka equals method call karta hai checking karne ke liye
		System.out.println(names.contains("pandurang"));
		
		
		//check for empty
		System.out.println(names.isEmpty());
		
		//setting value
//		names.set(0, "Ram");
		
		names.add(0,"Ram");
		System.out.println(names);
		
		
		//remove all the element
//		names.clear();
//		System.out.println("Data is = "+names);
		
		
		Vector<String> vector=new Vector<String>();
		vector.addAll(names);
		System.out.println(vector);
		
		
		System.out.println("---------------------------------------------------------__");
		HashSet<Double> nms = new HashSet<Double>();
		nms.add(14.14);
		nms.add(34.251);
		nms.add(5.5);
		nms.add(65.5);
		nms.add(65.5);
		System.out.println(nms);
		
		
		TreeSet<Double> tms=new TreeSet<Double>();
		tms.addAll(nms);
		System.out.println(tms);
		
		
	}
}
