package com.exceptionhandhing;

import java.util.Scanner;

import javax.swing.JFrame;


//how to create custom exception

class AgeInvalidException extends Exception
{
	public AgeInvalidException() {
		super("Age is invalid !");
	}
	
	AgeInvalidException(String message)
	{
		super(message);
	}
	
}






public class Example {
	public static void main(String[] args) {
//		AgeInvalidException ex=new AgeInvalidException("My Age is invalid !");

		
		
		System.out.println("Started...."); // starting point

		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Enter the no1 =");
			int n1 = scanner.nextInt();

			System.out.println("Enter the no2 =");
			int n2 = scanner.nextInt();

//			int n1 =Integer.parseInt(args[0]);
//			int n2 = Integer.parseInt(args[1]);

			System.out.println("we have got two numbers..");
			int result = n1 / n2;
			System.out.println("Division is =" + result);
			
			
			if(n2<10)
			{
				throw new AgeInvalidException("Hi age is invalid !! ");
			}
			
			
			
			
		} catch (ArithmeticException e) {
			System.out.println("n2 can not be zero");
			System.out.println(e.getMessage());
		}catch(NumberFormatException e)
		{
			System.out.println("Invalid Numbers");
			System.out.println(e.getMessage());
		}catch (AgeInvalidException e) {
			System.out.println("Invalid2");
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
		System.out.println("Error !!");
		System.out.println(e.getMessage());
		}finally {
			//always gets executed ...
			System.out.println("i am in finally block");
			System.out.println("closing all the resources");
		}

		System.out.println("Terminated...");// ending point
	}

}
