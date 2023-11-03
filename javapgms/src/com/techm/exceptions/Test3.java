package com.techm.exceptions;

//calling program 
public class Test3 {
	//calling functioin 
	public static void main(String[] args) {
		
		Test2 obj = new Test2();
		try {
		obj.division();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("something is wrong in division method");
		}
	}
	

}
