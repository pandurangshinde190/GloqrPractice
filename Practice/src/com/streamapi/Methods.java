package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Methods {

		public static void main(String[] args) {
			//filter(predicate)
			 //boolean value function
				//e ->{ }
			
			
			
			//map(function)
			/*
			 	each element operation
			  
			  
			 */
			List<String> names=Arrays.asList("Aman","Ankit","Abhinav","Durgesh");
			List<String> newNames = names.stream().filter(e ->e.startsWith("A")).collect(Collectors.toList());
			System.out.println(newNames);
			
			List<Integer>  numbers=Arrays.asList(23,4,2,5,7,4);
			List<Integer> newNumbers = numbers.stream().map(i->i*i).collect(Collectors.toList());
			System.out.println(newNumbers);
			
			
			names.stream().forEach(e ->{
				System.out.println(e);
			});
			
			//function reference
			newNames.stream().forEach(System.out::println);

			//sorted
			numbers.stream().sorted().forEach(System.out::println);
			
			Integer integer = numbers.stream().min((x,y) -> x.compareTo(y)).get();
			System.out.println("Minimum = "+integer);
			
			
//			Optional<Integer> maxNumber = numbers.stream().max((x,y) -> x.compareTo(y));
//			System.out.println("Maximum Number = "+maxNumber);
			
			Integer integer2 = numbers.stream().max((x,y) -> x.compareTo(y)).get();
			System.out.println("Maximum Number = "+integer2);
		}
}
