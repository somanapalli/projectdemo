package com.techm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test1 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//load the driver class
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver class loaded");
		
		//obtain the connection 
		Connection con = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe","rk","rk");
		System.out.println("i got the connection ");
		
		//create the object for Statement interface (to send the sql queries)
	    Statement st = con.createStatement();
	
	    //processing the queries
	    
	   // int x = st.executeUpdate("insert into student values(101,'sourabha')");
	    
	   // int x = st.executeUpdate("update student set stname='rk' where stid=101");
	   
	     int x= st.executeUpdate("delete from student where stid=101");
	    
	    System.out.println(x + "row(s) deleted");
	    
	    //close the connection 
	    con.close();
	}

}
