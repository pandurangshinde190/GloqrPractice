package Logical;

import java.util.Scanner;

public class If_Else_Condition {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// System.out.println("Enter the Number :=");
		int n = scan.nextInt();

        if (((n % 2 == 0)&&(n<=5))&& ((n >= 2) || (n >= 5))) 
        {
            System.out.println("Not Weird");
        } 
		else if((n>=21)&&(n<=24)) 
		{
			System.out.println("Not Weird");
		}else if (((n % 2 == 0)&&((n>=6)&&(n<=20))) && ((n >= 6) || (n <= 20)))
        {
            System.out.println("Weird");
        } else if(n%2==0)
        {
        	System.out.println("Not Weird");
        }
		else 
		{
			System.out.println("Weird");
		}

	}
}
