package Logical;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	//	System.out.println("Enter the value meal cost := ");
		double meal_cost=scan.nextDouble();
	//	System.out.println("Enter the value tip percent := ");
		int tip_percent=scan.nextInt();
		//System.out.println("Enter the value tax percent := ");
		int tax_percent=scan.nextInt();
		
		double tax=((double)tax_percent/100)*meal_cost;
		
		//System.out.println("Tax := "+tax);
		
		
		
		double tip =(meal_cost/100)*tip_percent;
	

		double total_cost= (meal_cost+tip+tax);
		int final_value=(int)Math.round(total_cost);
		
		System.out.println(final_value);
		
	}
}
