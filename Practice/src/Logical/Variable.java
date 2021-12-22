package Logical;

import java.util.Scanner;

public class Variable 
{
	public static void main(String[] args) {
		
		int i=12;
		double d=4.0;
		String s="is the best place to learn and practice coding!";
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Ebter the integer value := ");
		int positive=scanner.nextInt();
		
		System.out.println("Ebter the Double value := ");
		double floating_point=scanner.nextDouble();
		
		System.out.println("Ebter the String  := ");
		String string_val=scanner.next();
		
		
		System.out.println((i+positive));
		System.out.println((d+floating_point));
		System.out.println(string_val+" "+s);
		
	}
}
