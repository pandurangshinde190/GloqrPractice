package Star_Pattern;

import java.util.Scanner;

public class Demo9 {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the the number to print Tringle Star Pattern = ");
		int number=scanner.nextInt();
		
		for(int i=1;i<=number;i++)
		{
			for(int j=number;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
