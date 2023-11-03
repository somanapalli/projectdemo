package com.techm.cfw;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test1 {

	
	public static void main(String[] args) {
		//generics
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(new Student(100,"harshitha"));
		al.add(new Student(456,"anusha"));
		al.add(new Student(123,"mohansai"));
		
		for(Student s:al)
		{
			if(s.getStname().startsWith("h"))
			{
				System.out.println(s.getStname());
			}
		}
	
	}
	
}
