package com.techm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test2 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","root");
	
	    Statement st = con.createStatement();
	    
	    int x =  st.executeUpdate("insert into student values(101,'rk')");
	    System.out.println(x + "row(s) inserted");
	    
	    con.close();
	}

}
