package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;



public class DBFactory 
{
	Connection conn=null;
	public Connection oracelconn()
	{
		
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver loaded");
		conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
		System.out.println("connection established");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return conn;
	}
	public void oracleclose()
	{
		if(conn!=null)
		{
			try
			{
			conn.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
	}

}
