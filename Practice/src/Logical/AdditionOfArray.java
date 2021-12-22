package Logical;

import java.util.Scanner;

public class AdditionOfArray {
	

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of Array = ");
		int size = scanner.nextInt();

		int[] array = new int[size];

		int sum = 0;

		System.out.println("length of the array = " + array.length);

		System.out.println("Enter the the element of the sum = ");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}

//		for (int number = 0; number < array.length; number++) {
//
//			sum = sum + array[number];
//		}
//		System.out.println("Addition is = " + sum);

		for (int add : array) {
			sum=sum+add;
		}
		System.out.println(sum);

	}
}
