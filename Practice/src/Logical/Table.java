package Logical;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the no :-");

		int no = s.nextInt();
		
		
		for(int i=0;i<2;i++)
		{
			System.out.print("\t"+no);
			no++;
		}
		
		

//		System.out.print(no);
//		no++;
//		System.out.print("\t" + no);
//		no += 1;
//		for (int i = 1; i <= 10; i++) {
//			System.out.print("\t" + no * i);
//
//		}

		// 4
		// [3+ 8+ 0+ 1]
		// 12

	}
}
