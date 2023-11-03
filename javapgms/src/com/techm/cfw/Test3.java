package com.techm.cfw;

import java.util.LinkedHashSet;

public class Test3 {
	
	public static void main(String[] args) {
		
		
		LinkedHashSet<Student> hs = new LinkedHashSet<Student>();
		hs.add(new Student(100,"anusha"));
		hs.add(new Student(123,"harshitha"));
		hs.add(new Student(456,"mohansai"));
		hs.add(new Student(100,"anusha"));
		
		
		System.out.println(hs);
	}

}
