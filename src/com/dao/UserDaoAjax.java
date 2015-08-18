
	package com.dao;
	import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.dao.DBFactory;
	
	public class UserDaoAjax
	{
	PreparedStatement psRef=null;
	//	Statement psRef;
	DBFactory dbRef;
	Connection conRef;
		public UserDaoAjax() 
		{
		dbRef=new DBFactory();
		conRef=dbRef.oracelconn();
		}
		public int See(String userID)
		{
		int success=0;
			try 
			{
				psRef=conRef.prepareStatement("select * from ajaxlogin where user_id=?");
				//psRef=conRef.createStatement();
				
				psRef.setString(1,userID);
				
				//ResultSet res=psRef.executeQuery("select * from ajaxlogin where user_id='bharti123'");
				ResultSet res=psRef.executeQuery();
				if(res.next())
				{
					success=1;
					System.out.println("successfull");
				}
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		return success;
		}

}
