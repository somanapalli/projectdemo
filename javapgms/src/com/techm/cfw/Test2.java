package com.techm.cfw;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test2 {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=1;i<=10;i++)
		{
			al.add(i);
		}
		
		ListIterator<Integer> ltr = al.listIterator();
		
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
		System.out.println("======================");
		
		while(ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}
		
	}

}
