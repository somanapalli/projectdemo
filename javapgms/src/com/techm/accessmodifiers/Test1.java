package com.techm.accessmodifiers;

public class Test1 {
	//public properties
	public int x=100;
	public void display()
	{
		System.out.println(x);
	}

	public static void main(String[] args) {
		Test1 obj = new Test1();
		obj.display();
	}
}
