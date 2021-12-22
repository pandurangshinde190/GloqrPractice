package com.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TraverseExample {
	public static void main(String[] args) {
			//Type safe collection
				ArrayList<String> names=new ArrayList<String>();
				names.add("pandurang");
				names.add("Salim");
				names.add("Rohan");
				names.add("Rohan");
				names.add("abc");
				
				//1. for each loop
				for (String string : names) {
					System.out.print(string+"\t"+string.length()+"\t");
					StringBuffer stringBuffer=new StringBuffer(string);
					System.out.println(stringBuffer.reverse());
				}
				
				System.out.println("---------------------------------------------");
				//2.traversing using iterator FORWARD traversing
				Iterator<String> iterator = names.iterator();
				while(iterator.hasNext())
				{
					String next1 = iterator.next();
					System.out.println(next1);
				}
				
				
				System.out.println("---------------------------------------------");
				//3.backward traversal of collection LISTITERATOR
				ListIterator<String> listIterator2 = names.listIterator(names.size());
				
				while(listIterator2.hasPrevious())
				{
					String previous1 = listIterator2.previous();
					System.out.println(previous1);
				}
				
				System.out.println("---------------------------------------------");
				//Enumeration
							
				//4.for each method
				names.forEach(e ->{
					System.out.println(e);
				});
				
				
				System.out.println("---------------------------------------------");
				TreeSet<String> treeSet=new TreeSet<String>();
				treeSet.addAll(names);
				
				treeSet.forEach(e ->{
					System.out.println(e);
				});
				
				//comparable
				//comparator
				
	}
}
