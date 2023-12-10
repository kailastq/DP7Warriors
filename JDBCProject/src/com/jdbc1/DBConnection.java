package com.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	// Connection : interface
	
	public static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
	public static final String JDBC_URL="jdbc:mysql://127.0.0.1:3306/studentdb";
	public static final String USERNAME="root";
	public static final String PASSWORD="root";
	static Connection conn=null;
	
	public static Connection getConnect() 
	{
		try
		{
			//Loaded driver
			//we dont know the class 
			//load without creating instance
			//create automatically
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded......");
			conn= DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
			System.out.println("Connection done...");
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
