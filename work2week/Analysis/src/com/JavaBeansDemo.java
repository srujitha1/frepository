package com;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JavaBeansDemo {
	int c=0;


	public JavaBeansDemo() {
		
	}
    public int checkUser(String name,String pwd) throws ClassNotFoundException, SQLException
    {
    	
    	System.out.println(name+"hhhhhhhhhhhhhhhhh");
    	Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/User","root","Sapient123");
		Statement stmt = (Statement) con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from EMP");
		while(rs.next()) {
		if(rs.getString(1).equals(name) && rs.getString(2).equals(pwd))
		{
			c=1;
			return 1;
			
		
		}
		}
		if(c==0)
		{
			return 0;
		}
		return 0;
    }
    
    public int update(String name,String pwd) throws ClassNotFoundException, SQLException
    {
    	
    	
    	Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/User","root","Sapient123");
		Statement stmt = (Statement) con.createStatement();
		stmt.executeUpdate("insert into EMP values('"+name+"','"+pwd+"                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ')");
		return 0;
		
    }

}
