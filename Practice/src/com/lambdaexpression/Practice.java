package com.lambdaexpression;

public class Practice {
	public static void main(String[] args) {
		System.out.println("My System starts...");
		
//		MyInter myInter=new MyInterImpl();
//		myInter.sayHello();
		
//		MyInter i=new MyInter() {
//			
//			@Override
//			public void sayHello() {
//				// TODO Auto-generated method stub
//				System.out.println("this is first anonymous class");
//			}
//		};
//	
//		i.sayHello();
//		
//		MyInter i2=new MyInter() {
//			
//			@Override
//			public void sayHello() {
//				System.out.println("this is second anonymous class");
//				
//			}
//		};
//		
//		i2.sayHello();
		
		
		
		
		//using our functional interface with the help of lambda
		
//		MyInter i=() -> System.out.println("This is first time lambda expression");
//		
//		i.sayHello();
//		
//		MyInter i2=() -> System.out.println("this is second time lambda expression ");
//		
//		i2.sayHello();	
		
		
		
//		SumInter sumInter=(a,b) -> a+b;
//
//		System.out.println("Addition-1 is = "+sumInter.Sum(5, 5));
//		System.out.println("Addition-2 is = "+sumInter.Sum(6, 6));
		
		
		LengthInter lengthInter= str ->str.length();
		
		System.out.println("Length of the string is =  "+lengthInter.getLength("Pandurang Shinde"));

	}

}
