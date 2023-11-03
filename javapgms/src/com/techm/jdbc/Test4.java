package com.techm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test4 {
	
	public static void main(String[] args) {
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rk", "root", "root");
		
		PreparedStatement ps = con.prepareStatement("insert into student values(?,?)");
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter student id");
		
		int stid = s.nextInt();
		
		System.out.println("enter student name");
		
		String stname = s.next();
		
		ps.setInt(1, stid);
		ps.setString(2, stname);
		
		int x = ps.executeUpdate();
		System.out.println(x + "row(s) inserted");
		
		//close the connection 
		con.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
