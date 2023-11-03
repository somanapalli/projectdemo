package com.techm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test5 {
	
	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rk", "root", "root");
		
		Statement st = con.createStatement();
		
		st.addBatch("insert into student values(102,'techm')");
		st.addBatch("insert into student values(103,'infosys')");
		st.addBatch("delete from student where stid=100");
		int x[] = st.executeBatch();
		
		System.out.println(x[0] + "row(s) inserted");
		System.out.println(x[1] + "row(s) inserted");
		System.out.println(x[2] + "row(s) deleted");
		
		//close the connection 
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
