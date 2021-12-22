package Logical;

import java.util.Scanner;

public class DiagonalArrayAddition {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	
		System.out.println("Enter the matrix of rows size :=");
		int rows=scanner.nextInt();
		
		System.out.println("Enter the matrix of Colums size :=");
		int cols=scanner.nextInt();
		
		int[][] array=new int[rows][cols];
		int sum=0;
		int sum2=0;
		

		
		System.out.println("Enter the element of the array:= ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				array[i][j]=scanner.nextInt();
			}
		}
		
		System.out.println("element of the array are := ");
		
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
					sum=sum+array[i][j];
				}
			}
		}
		System.out.println("Addition is ="+sum);

	
		int jVal=cols-1;
		for(int i=0;i<rows;i++) {
			sum2=sum2+array[i][jVal];
			jVal--;
		}
		System.out.println("Addition2 is:"+sum2);
		
//        for (int i=0,j=cols-1 ; i<rows && j>=0 ; i++, j--) {
//            sum2= sum2 + array[i][j];
//     }
//        System.out.println("Addition is ="+sum2);
        
        
        System.out.println("Differece of the sum and sum2 := "+Math.abs(sum-sum2));
	}
}
