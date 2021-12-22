package Logical;

import java.util.Scanner;

public class Diagonal {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the marix rows size := ");
		int rows=scanner.nextInt();
		
		System.out.println("Enter the Matrix cols size := ");
		int cols=scanner.nextInt();
		
		int[][] array=new int[rows][cols];
		int sum1=0;
		int sum2=0;
		
		
		System.out.println("Enter the matrix Value :=");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				array[i][j]=scanner.nextInt();
			}
		}
		
		System.out.println("Enter the matrix are :=");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				if(i==j)
				{
					sum1+=array[i][j];
				}
			}
		}
		System.out.println("Addition is sum1 := "+sum1);
		
//		int j_val=cols-1;
//		for(int i=0;i<rows;i++)
//		{
//			sum2+=array[i][j_val];
//			j_val--;
//		}
		for(int i=0,j=cols-1;i<rows && j>=0;i++,j--)
		{
			sum2+=array[i][j];
		}
		System.out.println("Addition is sum2 := "+sum2);
		
		
		System.out.println("Difference of the sum1 and sum2 :="+Math.abs(sum1-sum2));
		

	}
}
