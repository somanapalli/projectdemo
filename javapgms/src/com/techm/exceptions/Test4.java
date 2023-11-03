package com.techm.exceptions;

public class Test4 {

	
	public void checkProduct(int weight)
	{
		if(weight>100)
		{
			System.out.println("product is valid");
		}
		else
		{
			try {
			throw new InvalidProductException("please check product weight");
			}
			catch(InvalidProductException ie)
			{
				System.out.println(ie);
			}
		}
	}
}
