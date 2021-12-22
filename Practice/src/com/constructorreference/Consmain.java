package com.constructorreference;

public class Consmain {
public static void main(String[] args) {
	System.out.println("Learning constructor reference");
	
	
	
	//constructor reference
	//ClassName::new;
		
//	Provider provider = () ->
//	{
//		return new Student();
//	};
	
	
	Provider provider = Student::new;
	
	
	Student student = provider.getStudent();
	student.display();
}
}
