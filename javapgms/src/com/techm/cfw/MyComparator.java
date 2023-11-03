package com.techm.cfw;

import java.util.Comparator;

public class MyComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		
		//return o2.getStid().compareTo(o1.getStid());
		
		return o2.getStname().compareTo(o1.getStname());
	}

}
