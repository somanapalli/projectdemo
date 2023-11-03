package com.techm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test3 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root","root");
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery("select * From student");
		while(rs.next())
		{
			System.out.println(rs.getInt(1) + " " + rs.getString(2));
		}
		
		con.close();
		
	}

}
