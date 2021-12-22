package Logical;

import java.util.Scanner;

public class ArrayRation {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the Array size :=");
		int size=scanner.nextInt();
		
		int[] array=new int[size];
		System.out.println("Array size is :="+array.length);
		int positive_numbers_count=0;
		int negative_number_count=0;
		int zero_number_count=0;
		
		System.out.println("Enter the element :=");
		for(int i=0;i<size;i++)
		{
			array[i]=scanner.nextInt();
		}
		
		System.out.println("Array Element are := ");
		for (int i : array) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		
		for(int i=0;i<size;i++)
		{
			if(array[i]>0)
			{
				positive_numbers_count++;
			}
			else if(array[i]==0){
				zero_number_count++;
			}
			else
			{
				negative_number_count++;
			}
		}
		System.out.println("Positive Number ="+positive_numbers_count);
		System.out.println("Negative number count := "+negative_number_count);
		System.out.println("Zero Number ="+zero_number_count);

		
		float p=(float)positive_numbers_count/array.length;
		System.out.println("Ration is ="+String.format("%.6f", p));
		
		float n=(float)negative_number_count/array.length;
		System.out.println("Ration is ="+String.format("%.6f", n));
		
		float z=(float)zero_number_count/array.length;
		System.out.println("Ration is ="+String.format("%.6f", z));
		
	}
}
