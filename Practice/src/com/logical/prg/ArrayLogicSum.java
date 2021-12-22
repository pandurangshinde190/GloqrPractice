package com.logical.prg;

import java.util.Scanner;

public class ArrayLogicSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Length := ");
		int length = scanner.nextInt();

		int[] array = new int[length];

		System.out.println("Enter the element := ");

		for (int i = 0; i < length; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.println("Enter the Sum := ");
		int sum = scanner.nextInt();

		for (int j = 0; j < length; j++) {
			for (int k = j; k < length; k++) {
				if ((array[j] + array[k] == sum)) {
					System.out.println(array[j] + "  " + array[k] + " = " + sum);
					
					if((array[j] - array[k] == sum)) {
						System.out.println(array[j] + "  " + array[k] + " = " + sum);
					}
				}
			}
		}
		



	}

}
