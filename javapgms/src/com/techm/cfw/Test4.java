package com.techm.cfw;

import java.util.TreeSet;

public class Test4 {
	
	public static void main(String[] args) {
		
		TreeSet<Student> ts = new TreeSet<Student>(new MyComparator());
		
		/*
		 * ts.add(123); ts.add(9); ts.add(987); ts.add(-6);
		 */
		
		/*
		 * ts.add("rama"); ts.add("anusha"); ts.add("swetha"); ts.add("hrishitha");
		 */
		
		ts.add(new Student(100,"rama"));
		ts.add(new Student(345,"anusha"));
	
		System.out.println(ts);
		
	}

}
