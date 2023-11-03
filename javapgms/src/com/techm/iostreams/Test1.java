package com.techm.iostreams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Test1 {
	
	public static void main(String[] args) throws IOException {
		//create the object for File class 
		
		File f = new File("rk.txt");
		
		f.createNewFile();
		
		System.out.println(f.exists());
		
		PrintWriter pw = new PrintWriter("rk.txt");
		
		pw.println(100);
		pw.println("rama");
		pw.println(8.9);
		pw.println(true);
		
		pw.flush();
		
		System.out.println("write opeartion has done");
		
		
		//read the data from the file 
		
		BufferedReader br = new BufferedReader(new FileReader("rk.txt"));
		
		String s = br.readLine();
		
		while(s!=null) {
		System.out.println(s);
		 s = br.readLine();
		}
		
		pw.close();
		br.close();
		
	}

}
