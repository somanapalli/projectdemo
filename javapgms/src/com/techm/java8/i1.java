package com.techm.java8;

public interface i1 {
	
	public default void m1()
	{
		System.out.println("default method ");
	}

	public static void m2()
	{
		System.out.println("static method");
	}
	
	void sum(int x, int y);
}
