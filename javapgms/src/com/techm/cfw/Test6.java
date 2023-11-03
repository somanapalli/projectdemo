package com.techm.cfw;

import java.util.TreeMap;

public class Test6 {
	
	public static void main(String[] args) {
		
		TreeMap<Student,Integer> hm = new TreeMap<Student,Integer>();
		
		hm.put(new Student(100,"rama"), 1);
		hm.put(new Student(200,"pavan"),2);
		hm.put(new Student(300,"harshiv"),3);
		
		
		System.out.println(hm);
	}

}
