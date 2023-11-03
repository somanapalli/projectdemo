package com.techm.exceptions;

//called program 
public class Test2 {
	
	//called function 
	public void division() throws ArithmeticException
	{
		int z = 100/0;
		System.out.println("division is: " + z);
	}

}
