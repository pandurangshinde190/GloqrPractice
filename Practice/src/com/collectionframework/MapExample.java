package com.collectionframework;

import java.util.HashMap;

public class MapExample {
	public static void main(String[] args) {
		HashMap<String, Integer> courses=new HashMap<String, Integer>();
		
		//adding element
		courses.put("Core Java", 4000);
		courses.put("Basic Python", 3500);
		courses.put("Android", 5000);
		
//		System.out.println(courses);
//		courses.forEach((e1,e2) ->{ 
//			System.out.println(e1+" = "+e2);
//		});
		
		courses.forEach((key,value) ->{
			System.out.print(key);
			System.out.print("=>");
			System.out.println(value);
			System.out.println();
		});
		
	}
}
