package com.techm.superkeyword;
//parent class
public class Test1 {
	
	public Test1()
	{
		System.out.println("Test1 default constructor");
	}
	
	public Test1(int x)
	{
		//calling current class default constructor
		this();
		System.out.println("Test1 Parameterized constructor");
	}

}
