package Logical;

import java.util.Scanner;

public class ArrayLogicSum {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the Length := ");
		int length=scanner.nextInt();
		
		int[] array=new int[length];
		
		System.out.println("Enter the element := ");
		
		for (int i = 0; i < length; i++) {
			array[i] = scanner.nextInt();
		}
		
	}

}
