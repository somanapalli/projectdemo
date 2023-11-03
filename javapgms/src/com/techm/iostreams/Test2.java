package com.techm.iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test2 {
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("rk.txt"));
	
		Student stu = new Student(100,"anusha");
		
		oos.writeObject(stu);
		
		System.out.println("writint the object data  opeation has done ");
	
	
		//create the object for ObjectInpputStream 
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("rk.txt"));
	
		Student st = (Student)ois.readObject();
		
		System.out.println("student id is: " + st.getStid());
		System.out.println("student name is: " + st.getStname());
	}

}
