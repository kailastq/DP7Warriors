package com.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	public static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
	public static final String JDBC_URL="jdbc:mysql://localhost:3306/studentdb";
	public static final String USERNAME="root";
	public static final String PASSWORD="root";

	static Connection conn=null;

	
	//connection interface
	
	public static Connection getConnect()
	{
		try
		{
			//load the driver
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded......");
			
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
			System.out.println("connection done...");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return conn;
	}
	
	public static void main(String[] args) {
		
		getConnect();
	}

}